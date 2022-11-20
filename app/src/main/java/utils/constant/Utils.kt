package utils.constant

import android.content.Context
import android.widget.Toast
import androidx.core.content.ContextCompat
import java.text.SimpleDateFormat
import java.util.*

fun parseEventDate(inputDate: String, format: String): Date? {
    val sdf = SimpleDateFormat(format)
    return sdf.parse(inputDate)
}

fun showToast(context: Context, message: String, period: Int) {
    when(period)
    {
        1 -> {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
        else -> {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

}



