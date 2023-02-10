package data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="ItemToSell")
data class SellItem(@PrimaryKey @ColumnInfo(name = "id") val id: Int?
                    ,@ColumnInfo(name = "name") val name: String?
                    ,@ColumnInfo(name = "price") val price: Float?
                    ,@ColumnInfo(name = "quantity") val quantity: Int?
                    ,@ColumnInfo(name = "type") val type: Int?)