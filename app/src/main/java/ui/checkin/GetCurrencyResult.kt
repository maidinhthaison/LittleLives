package ui.checkin

data class GetCurrencyResult(
    val loading: Boolean = false,
    val success: GetCurrencyView? = null,
    val error: String? = null
)