package data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import data.local.dao.SellItem
import data.local.dao.SellItemDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [SellItem::class], version = 1, exportSchema = false)
abstract class ItemToSellDB : RoomDatabase(){

    abstract fun sellItemDao() : SellItemDao

    companion object {

        @Volatile
        private var INSTANCE : ItemToSellDB? = null

        fun getDatabase(context: Context, scope: CoroutineScope):ItemToSellDB{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ItemToSellDB::class.java,
                    "item_sell_database"
                ).addCallback(SellItemCallback(scope))
                    .build()

                INSTANCE = instance

                // return instance
                instance
            }
        }
    }

    private class SellItemCallback(val scope: CoroutineScope): RoomDatabase.Callback(){
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            INSTANCE?.let { sellItemRoomDB ->
                scope.launch {
                    sellItemRoomDB.sellItemDao().insert(SellItem(1, "Iphone X", 150000.0f, 1,2 ))
                    sellItemRoomDB.sellItemDao().insert(SellItem(2, "TV", 38000.0f, 2,2 ))
                    sellItemRoomDB.sellItemDao().insert(SellItem(3, "Table", 12000.0f, 1,2 ))
                }
            }
        }
    }
}