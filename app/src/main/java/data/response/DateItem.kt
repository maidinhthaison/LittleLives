package data.response

class DateItem : ListItem() {

    var eventDate: String? = ""
        internal set

    override fun getType(): Int {
        return TYPE_DATE
    }

}