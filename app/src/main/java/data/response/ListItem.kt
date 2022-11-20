package data.response

abstract class ListItem {
    abstract fun getType(): Int

    companion object {
        const val TYPE_DATE = 0
        const val TYPE_ITEM = 1
    }

}