package ui.news

data class GetNewsResult(
    val loading: Boolean = false,
    val success: GetNewsView? = null,
    val error: String? = null
)