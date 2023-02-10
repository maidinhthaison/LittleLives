package ui.inbox.fragment

import androidx.lifecycle.*
import data.local.dao.SellItem
import data.repository.SellItemRepository
import kotlinx.coroutines.launch

class SellItemViewModel (private val sellItemRepository: SellItemRepository) : ViewModel() {

    val allItems : LiveData<MutableList<SellItem>> = sellItemRepository.allSellItems.asLiveData()

    // Launching a new coroutine to insert the data in a non-blocking way
    fun insert(sellItem: SellItem) = viewModelScope.launch {
        sellItemRepository.insert(sellItem)
    }

    fun delete(sellItem: SellItem) = viewModelScope.launch {
        sellItemRepository.delete(sellItem)
    }

    class SellItemViewModelFactory(private val sellItemRepository: SellItemRepository)
        : ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(SellItemViewModel::class.java)){
                @Suppress("UNCHECKED_CAST")
                return SellItemViewModel(sellItemRepository) as T
            }
            throw IllegalArgumentException("Unknown VieModel Class")
        }

    }
}