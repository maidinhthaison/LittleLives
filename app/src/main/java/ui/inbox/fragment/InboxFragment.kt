package ui.inbox.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.jetpack.demo.R
import com.jetpack.demo.databinding.FragmentInboxBinding
import dagger.hilt.android.AndroidEntryPoint
import main.MainApplication
import utils.constant.hideProgressDialog
import utils.constant.showProgressDialog

@AndroidEntryPoint
class InboxFragment : Fragment() {
    private var _binding: FragmentInboxBinding? = null
    private val binding get() = _binding!!

    private lateinit var sellListAdapter: SellListAdapter

    private val sellItemViewModel: SellItemViewModel by viewModels {
        SellItemViewModel.SellItemViewModelFactory(MainApplication.instance.repository)
    }

    companion object {
        @JvmStatic
        fun newInstance() = InboxFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInboxBinding.inflate(inflater, container, false)
        val view =  binding.root
        sellListAdapter = SellListAdapter(context = requireContext())
        setupRecyclerView()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showProgressDialog()
        sellItemViewModel.allItems.observe(viewLifecycleOwner) { listItem ->
            listItem?.let {
                sellListAdapter.submitList(listItem)
                hideProgressDialog()
            }
        }
    }
    private fun setupRecyclerView(){
        binding.rvSellList.apply {
            adapter = sellListAdapter
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
    override fun onResume() {
        super.onResume()

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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

