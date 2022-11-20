package ui.news.fragment

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.work.*
import com.jetpack.demo.databinding.FragmentNewsBinding
import dagger.hilt.android.AndroidEntryPoint
import data.remote.workers.DownloadFileWorker
import data.response.DateItem
import data.response.GeneralItem
import data.response.ListItem
import ui.news.NewsAdapter
import ui.news.NewsViewModel
import utils.constant.*
import com.jetpack.demo.R


@AndroidEntryPoint
class NewsFragment : Fragment(), NewsAdapter.DownloadClickListener {
    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!

    private lateinit var newsAdapter: NewsAdapter
    private val newsViewModel: NewsViewModel by viewModels()

    companion object {

        fun newInstance(): NewsFragment {
            val mainFragment = NewsFragment()
            val args = Bundle()
            mainFragment.arguments = args
            return mainFragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        newsAdapter = NewsAdapter(context = requireContext(), this)
        setupRecyclerView()

        newsViewModel.getNewsResult.asLiveData().observe(viewLifecycleOwner, Observer {
            val getEventResult = it ?: return@Observer
            val hashMap = getEventResult.success?.eventData?.eventResponse?.groupDataIntoHashMap()
            val list: MutableList<ListItem> = ArrayList()
            for (date in hashMap!!.keys) {
                val dateItem = DateItem()
                dateItem.eventDate = date
                list.add(dateItem)
                for (item in hashMap[date]!!) {
                    val generalItem = GeneralItem()
                    generalItem.userTimeLine = item
                    item.generateEventSnapshot()
                    list.add(generalItem)
                }
            }

            newsAdapter.submitList(list)
            hideProgressDialog()
        })


        if (!checkPermission(Manifest.permission.READ_EXTERNAL_STORAGE) && !checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ),
                201
            )
        }

        return binding.root
    }
    private fun setupRecyclerView(){
        binding.rvEvent.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(context)
            itemAnimator = DefaultItemAnimator()
            addItemDecoration(
                DividerItemDecoration(
                    requireContext(),
                    (layoutManager as LinearLayoutManager).orientation
                )
            )
            hasFixedSize()
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showProgressDialog()
        newsViewModel.getListEvent(requireContext())

    }
    private fun showProgressDialog() {
        if (isAdded) {
            childFragmentManager.showProgressDialog(
                getString(R.string.processing),
                getString(R.string.please_wait)
            )
        }
    }

    private fun hideProgressDialog() {
        if (isAdded) {
            childFragmentManager.hideProgressDialog()
        }
    }
    override fun onResume() {
        super.onResume()
    }

    override fun onDownloadClick(fileName: String, fileUrl: String, fileType: String) {
        startDownloadingFile(fileName, fileUrl, fileType)
    }

    private fun startDownloadingFile(
        fileName: String, fileUrl: String, fileType: String
    ) {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .setRequiresStorageNotLow(true)
            .setRequiresBatteryNotLow(true)
            .build()
        val data = Data.Builder()

        data.apply {
            putString(KEY_INPUT_FILE_NAME, fileName)
            putString(KEY_INPUT_FILE_URL, fileUrl)
            putString(KEY_INPUT_FILE_TYPE, fileType)
        }

        val oneTimeWorkRequest = OneTimeWorkRequest.Builder(DownloadFileWorker::class.java)
            .setConstraints(constraints)
            .setInputData(data.build())
            .build()

        WorkManager.getInstance(requireContext()).enqueue(oneTimeWorkRequest)

        WorkManager.getInstance(requireContext()).getWorkInfoByIdLiveData(oneTimeWorkRequest.id)
            .observe(this) { info ->
                info?.let {
                    when (it.state) {
                        WorkInfo.State.SUCCEEDED -> {

                            showToast(requireContext(), it.outputData.getString(KEY_OUTPUT_FILE_URI).toString(), 1)
                        }
                        WorkInfo.State.FAILED -> {
                            showToast(requireContext(), it.outputData.getString(KEY_OUTPUT_MESSAGE).toString(),1)
                        }
                        WorkInfo.State.RUNNING -> {
                            showToast(requireContext(),  "DOWNLOAD IN PROGRESS!!!",1)

                        }
                        else -> {

                        }
                    }
                }
            }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 201) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                showToast(requireContext(), "Permission granted",1)
            } else {
                showToast(requireContext(), "Permission denied",1)
            }
        }
    }

    private fun checkPermission(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            requireContext(),
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }
}