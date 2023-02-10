package ui.checkin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jetpack.demo.R
import data.remote.response.Info

import di.GlideUtils

internal class CurrencyAdapter(private var context: Context)
    : ListAdapter<Info, CurrencyAdapter.CurrencyViewHolder>(DIFF_CALLBACK) {
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.currency_item, parent, false)
        return CurrencyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    internal inner class CurrencyViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        private var tvTitle: AppCompatTextView = view.findViewById(R.id.text_title)
        private var tvName: AppCompatTextView = view.findViewById(R.id.text_name)
        private var ivIcon : AppCompatImageView = view.findViewById(R.id.imv_currency_icon)

        fun bind(item: Info) {
            tvTitle.text = item.name
            tvName.text = "${item.buy_price}-${item.sell_price}"
            GlideUtils().loadImage(context, item.icon, ivIcon)
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Info>() {

            override fun areItemsTheSame(
                oldItem: Info,
                newItem: Info
            ): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(
                oldItem: Info,
                newItem: Info
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}