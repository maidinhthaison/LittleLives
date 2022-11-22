package ui.news

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.work.*
import com.jetpack.demo.R
import data.response.DateItem
import data.response.GeneralItem
import data.response.ListItem
import data.response.UserTimeLine.Companion.CheckIn
import data.response.UserTimeLine.Companion.CheckOut
import data.response.UserTimeLine.Companion.Event
import data.response.UserTimeLine.Companion.EveryDayHealth
import data.response.UserTimeLine.Companion.Portfolio
import data.response.UserTimeLine.Companion.StoryExported
import data.response.UserTimeLine.Companion.StoryPublished
import di.GlideUtils


class NewsAdapter(
    private var context: Context,
    private var downloadClickListener: DownloadClickListener
) :
    ListAdapter<ListItem, RecyclerView.ViewHolder>(ItemDiffCallBack()) {

    interface DownloadClickListener {
        fun onDownloadClick(fileName: String, fileUrl: String, fileType: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        return when (viewType) {
            ListItem.TYPE_ITEM -> {
                view =
                    LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
                ItemViewHolder(view)
            }
            else -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.sticky_date_item, parent, false)
                StickyViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            ListItem.TYPE_ITEM -> {
                val generalItem = getItem(position) as GeneralItem
                (holder as ItemViewHolder).bind(generalItem)
            }
            else -> {
                val dateItem = getItem(position) as DateItem
                (holder as StickyViewHolder).bind(dateItem)
            }

        }
    }

    override fun getItemViewType(position: Int): Int {

        return when (getItem(position).getType()) {
            ListItem.TYPE_ITEM -> ListItem.TYPE_ITEM
            else -> ListItem.TYPE_DATE
        }

    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    internal inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var tvEventType: AppCompatTextView = view.findViewById(R.id.tvEventType)
        private var tvEventDesc: AppCompatTextView = view.findViewById(R.id.tvEventDesc)

        private var llItemAction: LinearLayoutCompat = view.findViewById(R.id.llItemAction)
        private var tvAction: AppCompatTextView = view.findViewById(R.id.tvAction)
        private var imvAction: AppCompatImageView = view.findViewById(R.id.imvAction)

        private var imvEventItem: AppCompatImageView = view.findViewById(R.id.imvEventItem)
        private var imvEventBullet: AppCompatImageView = view.findViewById(R.id.imvEventBullet)
        fun bind(item: GeneralItem) {
            when (item.userTimeLine?.eventType) {
                Event -> {
                    imvEventBullet.setImageResource(R.drawable.ic_event_48)
                    tvEventType.text = context.getString(R.string.event_list_item_caption)
                    val text = item.userTimeLine?.eventSnapshotData?.formatDisplayEventName(
                        context.getString(R.string.text_create_event)
                    )
                    tvEventDesc.text =
                        HtmlCompat.fromHtml(text.toString(), HtmlCompat.FROM_HTML_MODE_COMPACT)

                    imvEventItem.isVisible = false
                    llItemAction.isVisible = true
                    tvAction.text = context.resources.getString(R.string.text_btn_add)
                    imvAction.setImageResource(R.drawable.ic_event_48)
                }
                CheckIn, CheckOut -> {
                    imvEventBullet.setImageResource(R.drawable.ic_account_48)
                    tvEventType.text = context.getString(R.string.checkinout_list_item_caption)

                    val oldText: String = item.userTimeLine?.eventDescription.toString()
                    val htmlText =
                        item.userTimeLine?.checkInOutSnapshotData?.msgParams?.formatDisplayCheckInOut(
                            oldText
                        )
                    tvEventDesc.text =
                        HtmlCompat.fromHtml(htmlText.toString(), HtmlCompat.FROM_HTML_MODE_COMPACT)

                    llItemAction.isVisible = false
                    imvEventItem.isVisible = true
                    GlideUtils().loadImage(
                        context,
                        item?.userTimeLine?.checkInOutSnapshotData?.checkinUrl,
                        imvEventItem
                    )
                }
                Portfolio -> {
                    imvEventBullet.setImageResource(R.drawable.ic_portfolio_48)
                    tvEventType.text = context.getString(R.string.portfolio_list_item_caption)
                    tvEventDesc.text = item.userTimeLine?.eventDescription

                    llItemAction.isVisible = false
                    imvEventItem.isVisible = true
                }
                StoryExported -> {
                    val text: String = item.userTimeLine?.eventDescription + " " +
                            item.userTimeLine?.storyExportedSnapshotData?.getDomainName()

                    val fileName = item.userTimeLine?.storyExportedSnapshotData?.getDomainName()
                        ?.substringBeforeLast(".").toString()
                    val filetype = item.userTimeLine?.storyExportedSnapshotData?.getDomainName()
                        ?.substringAfterLast(".").toString()
                    val fileUrl = item?.userTimeLine?.storyExportedSnapshotData?.url.toString()
                    imvEventBullet.setImageResource(R.drawable.ic_portfolio_48)
                    tvEventType.text = context.getString(R.string.portfolio_list_item_caption)

                    tvEventDesc.text = text
                    imvEventItem.isVisible = false

                    llItemAction.isVisible = true
                    tvAction.text = context.resources.getString(R.string.text_btn_download)
                    imvAction.setImageResource(R.drawable.ic_download_48)

                    if (tvAction.text == context.resources.getString(R.string.text_btn_download)) {
                        llItemAction.setOnClickListener {
                            downloadClickListener.onDownloadClick(fileName, fileUrl, filetype)
                        }
                    }
                }
                StoryPublished -> {
                    imvEventBullet.setImageResource(R.drawable.ic_portfolio_48)
                    tvEventType.text = context.getString(R.string.portfolio_list_item_caption)

                    val oldText: String = item.userTimeLine?.eventDescription.toString()
                    val htmlText =
                        item.userTimeLine?.storyPublishedSnapshotData?.formatDisplayStoryPublish(
                            oldText
                        )
                    tvEventDesc.text =
                        HtmlCompat.fromHtml(htmlText.toString(), HtmlCompat.FROM_HTML_MODE_COMPACT)

                    llItemAction.isVisible = false
                    imvEventItem.isVisible = true
                }
                EveryDayHealth -> {
                    imvEventBullet.setImageResource(R.drawable.ic_event_48)

                    tvEventType.text = context.getString(R.string.everydayHealth_list_item_caption)
                    tvEventDesc.text = item.userTimeLine?.eventDate

                    llItemAction.isVisible = false
                    imvEventItem.isVisible = false
                }
            }
        }
    }

    internal inner class StickyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var tvEventDate: AppCompatTextView = view.findViewById(R.id.tvEventDate)
        fun bind(item: DateItem) {
            tvEventDate.text = item.eventDate
        }
    }

    internal class ItemDiffCallBack : DiffUtil.ItemCallback<ListItem>() {

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
            return (oldItem as DateItem).eventDate == (newItem as DateItem).eventDate
        }

    }

}