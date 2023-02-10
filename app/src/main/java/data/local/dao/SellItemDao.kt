package data.local.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface SellItemDao {
    @Query("SELECT * FROM ItemToSell ORDER BY id")
    fun getAllItems(): Flow<MutableList<SellItem>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(sellItem: SellItem)

    @Delete
    suspend fun delete(sellItem: SellItem)

    @Delete
    suspend fun update(sellItem: SellItem)
}
