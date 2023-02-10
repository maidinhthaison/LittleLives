package data.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CurrencyResponse(
    @SerializedName("data")
    val listData: List<Info>
): Parcelable

@Parcelize
data class Info(
    @SerializedName("base")
    val base: String?,

    @SerializedName("counter")
    val counter: String?,

    @SerializedName("buy_price")
    val buy_price: String?,

    @SerializedName("sell_price")
    val sell_price: String?,

    @SerializedName("icon")
    val icon: String?,

    @SerializedName("name")
    val name: String?
): Parcelable