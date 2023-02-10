package ui.checkin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.jetpack.demo.R
import com.jetpack.demo.databinding.FragmentCheckinBinding
import dagger.hilt.android.AndroidEntryPoint
import ui.checkin.CurrencyAdapter
import ui.checkin.CurrencyViewModel
import utils.constant.hideProgressDialog
import utils.constant.showProgressDialog

@AndroidEntryPoint
class CheckInFragment : Fragment(){
    private var _binding: FragmentCheckinBinding? = null
    private val binding get() = _binding!!

    private lateinit var currencyAdapter: CurrencyAdapter
    private val currencyViewModel: CurrencyViewModel by viewModels()

    companion object {
        @JvmStatic
        fun newInstance() = CheckInFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCheckinBinding.inflate(inflater, container, false)
        val view = binding.root
        currencyAdapter = CurrencyAdapter(context = requireContext())
        setupRecyclerView()
        currencyViewModel.getCurrencyResult.asLiveData().observe(viewLifecycleOwner, Observer {
            val getCurrencyResult = it ?: return@Observer
            val response = getCurrencyResult.success?.currencyResponse
            if (response != null) {
                currencyAdapter.submitList(response.listData)
            }
            hideProgressDialog()

        })


        return view
    }

    private fun setupRecyclerView(){
        binding.rvCurrency.apply {
            adapter = currencyAdapter
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
        currencyViewModel.getListCurrency(counter_currency = "USD")
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}