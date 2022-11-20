package data.response

class GeneralItem : ListItem() {

    var userTimeLine: UserTimeLine? = null
        internal set

    override fun getType(): Int {
        return TYPE_ITEM
    }


}