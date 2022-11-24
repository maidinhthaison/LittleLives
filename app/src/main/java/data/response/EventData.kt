package data.response

import android.os.Parcelable
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import di.LocalModule
import kotlinx.parcelize.Parcelize
import utils.constant.*
import java.text.DateFormat
import java.text.SimpleDateFormat

private val gson: Gson = LocalModule.provideGson().apply {
    GsonBuilder().apply {
        enableComplexMapKeySerialization()
        serializeNulls()
        setDateFormat(DateFormat.LONG)
        setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        setPrettyPrinting()
      }.create()
}
@Parcelize
data class EventData(
    @SerializedName("data")
    val eventResponse: EventResponse

) : Parcelable

@Parcelize
data class EventResponse(
    @SerializedName("userTimeline")
    val listUserTimeline: List<UserTimeLine>
) : Parcelable {
    fun groupDataIntoHashMap(): Map<String?, List<UserTimeLine>> {
        listUserTimeline.forEach { it.eventDate = formatEventDate(it.eventDate.toString()) }
        return listUserTimeline.groupBy { it.eventDate }
    }

    private fun formatEventDate(str: String): String? {
        val sdf = SimpleDateFormat(EVENT_DATE_FORMAT)
        return sdf.format(parseEventDate(str, EVENT_DATE_FORMAT_ORIGIN))
    }

}

@Parcelize
data class UserTimeLine(
    @SerializedName("__typename")
    val __typename: String?,

    @SerializedName("eventDate")
    var eventDate: String?,

    @SerializedName("eventDescription")
    val eventDescription: String?,

    @SerializedName("eventSnapshot")
    val eventSnapshot: String?,

    @SerializedName("eventType")
    val eventType: String?,

    @SerializedName("insertedAt")
    val insertedAt: String?,

    var eventSnapshotData: EventItem? = null,
    var checkInOutSnapshotData: CheckInOut? = null,
    var portfolioSnapshotData: Portfolio? = null,
    var storyExportedSnapshotData: StoryExported? = null,
    var storyPublishedSnapshotData: StoryPublished? = null,
    var everyDayHealthSnapshotData: EverydayHealth? = null

    ) : Parcelable {

    companion object {
        const val Event = "event"
        const val CheckOut = "checkOut"
        const val CheckIn = "checkIn"
        const val Portfolio = "portfolio"
        const val StoryExported = "story_exported"
        const val StoryPublished = "story_published"
        const val EveryDayHealth = "everydayHealth"
    }

    fun generateEventSnapshot()  {
        when (eventType) {
            Event -> {
                val itemType = object : TypeToken<EventItem>() {}.type
                eventSnapshotData = gson.fromJson<EventItem>(eventSnapshot, itemType)
            }
            CheckOut, CheckIn -> {
                val itemType = object : TypeToken<CheckInOut>() {}.type
                checkInOutSnapshotData = gson.fromJson<CheckInOut>(eventSnapshot, itemType)
            }
            Portfolio -> {
                val itemType = object : TypeToken<Portfolio>() {}.type
                portfolioSnapshotData= gson.fromJson<Portfolio>(eventSnapshot, itemType)
            }
            StoryExported -> {
                val itemType = object : TypeToken<StoryExported>() {}.type
                storyExportedSnapshotData = gson.fromJson<StoryExported>(eventSnapshot, itemType)

            }
            StoryPublished -> {
                val itemType = object : TypeToken<StoryPublished>() {}.type
                storyPublishedSnapshotData = gson.fromJson<StoryPublished>(eventSnapshot, itemType)

            }
            EveryDayHealth -> {
                val itemType = object : TypeToken<EverydayHealth>() {}.type
                everyDayHealthSnapshotData = gson.fromJson<EverydayHealth>(eventSnapshot, itemType)
            }
        }
    }
}

@Parcelize
data class EventItem(
    @SerializedName("childId")
    val childId: String?,

    @SerializedName("childName")
    val childName: String?,

    @SerializedName("eventDate")
    val eventDate: String?,

    @SerializedName("eventTitle")
    val eventTitle: String?,

    @SerializedName("schoolId")
    val schoolId: String?,

    @SerializedName("schoolName")
    val schoolName: String?


) : Parcelable{
    fun formatDisplayEventName(strRes: String): String {
        val name = "<b>${schoolName}</b>"
        val title = "<b>${eventTitle}</b>"
        return strRes.format(name, title, formatEventDate())
    }
    private fun formatEventDate(): String? {
        val sdf = SimpleDateFormat(CREATE_EVENT_DATE_FORMAT)
        return sdf.format(parseEventDate(eventDate.toString(), CREATE_EVENT_DATE_FORMAT_ORIGIN))
    }
}

@Parcelize
data class CheckInOut(
    @SerializedName("checkinThumb")
    val checkinThumb: String?,

    @SerializedName("checkinUrl")
    val checkinUrl: String?,

    @SerializedName("schoolId")
    val schoolId: String?,

    @SerializedName("msgParams")
    val msgParams: MsgParams?,

    @SerializedName("referenceObject")
    val referenceObject: ReferenceObject?
) : Parcelable {
    @Parcelize
    data class MsgParams(
        @SerializedName("attendanceRecordId")
        val attendanceRecordId: String?,

        @SerializedName("checkInDate")
        val checkInDate: String?,

        @SerializedName("childName")
        val childName: String?,

        @SerializedName("rawCheckInDate")
        val rawCheckInDate: String?,

        @SerializedName("schoolName")
        val schoolName: String?

    ) : Parcelable{
        fun formatDisplayCheckInOut(originalString: String): String {
            val builder0 = StringBuilder()
            builder0.append("<b>")
                .append(childName.toString())
                .append("</b>")

            val dateFormatted = formatDateCheckInOut(rawCheckInDate.toString())

            val builder1 = StringBuilder()
                .append(dateFormatted)

            return originalString.replace(childName.toString(), builder0.toString())
                .replace(checkInDate.toString(), builder1.toString())
        }

        private fun formatDateCheckInOut(str: String): String? {
            val sdf = SimpleDateFormat(STORY_CHECK_IN_OUT_DATE_FORMAT)
            return sdf.format(parseEventDate(str, STORY_CHECK_IN_OUT_DATE_FORMAT_ORIGIN))
        }
    }
}

@Parcelize
data class Portfolio(
    @SerializedName("albumId")
    val albumId: String?,

    @SerializedName("albumName")
    val albumName: String?,

    @SerializedName("caption")
    val caption: String?,

    @SerializedName("childId")
    val childId: String?,

    @SerializedName("childName")
    val childName: String?,

    @SerializedName("imageUrl")
    val imageUrl: String?,

    @SerializedName("referenceObject")
    val referenceObject: ReferenceObject?,

    @SerializedName("schoolId")
    val schoolId: String?,

    @SerializedName("schoolName")
    val schoolName: String?,

    @SerializedName("teacherName")
    val teacherName: String?

) : Parcelable

@Parcelize
data class StoryPublished(
    @SerializedName("publisher_id")
    val publisher_id: String?,

    @SerializedName("publisher_name")
    val publisher_name: String?,

    @SerializedName("school_id")
    val school_id: String?,

    @SerializedName("story_id")
    val story_id: String?,

    @SerializedName("story_image")
    val story_image: String?,

    @SerializedName("story_name")
    val story_name: String?

) : Parcelable{
    fun formatDisplayStoryPublish(originalString: String): String {
        val builder0 = StringBuilder()
        builder0.append("<b>")
            .append(publisher_name.toString())
            .append("</b>")

        val builder1 = StringBuilder()
        builder1.append("<b>")
            .append(story_name.toString())
            .append("</b>")
        return originalString.replace(publisher_name.toString(), builder0.toString())
            ?.replace(story_name.toString(), builder1.toString())
    }
}

@Parcelize
data class StoryExported(
    @SerializedName("exp")
    val exp: String?,

    @SerializedName("school_id")
    val school_id: String?,

    @SerializedName("url")
    val url: String?

) : Parcelable {
    fun getDomainName() : String {
        return url?.substringAfterLast("/").toString()
    }
}


@Parcelize
data class EverydayHealth(
    @SerializedName("activityClass")
    val activityClass: String?,

    @SerializedName("activityId")
    val activityId: String?,

    @SerializedName("activitySubType")
    val activitySubType: String?,

    @SerializedName("activityType")
    val activityType: String?,

    @SerializedName("endTime")
    val endTime: String?,

    @SerializedName("remarks")
    val remarks: String?,

    @SerializedName("schoolId")
    val schoolId: String?,

    @SerializedName("startTime")
    val startTime: String?,

    @SerializedName("referenceObject")
    val referenceObject: ReferenceObject?
) : Parcelable

@Parcelize
data class ReferenceObject(
    @SerializedName("type")
    val type: String?,
    @SerializedName("value")
    val value: String?

) : Parcelable

