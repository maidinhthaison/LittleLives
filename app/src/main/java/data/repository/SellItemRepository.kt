package data.repository

import androidx.annotation.WorkerThread
import data.local.dao.SellItem
import data.local.dao.SellItemDao
import kotlinx.coroutines.flow.Flow

class SellItemRepository (private val sellItemDao: SellItemDao) {

    val allSellItems: Flow<MutableList<SellItem>> = sellItemDao.getAllItems()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(sellItem: SellItem){
        sellItemDao.insert(sellItem)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(sellItem: SellItem){
        sellItemDao.delete(sellItem)
    }

}
