package ui.inbox.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jetpack.demo.R
import data.local.dao.SellItem

internal class SellListAdapter (private var context: Context)
    : ListAdapter<SellItem, SellListAdapter.SellListViewHolder>(DIFF_CALLBACK) {
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellListViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.selllist_itemview, parent, false)
        return SellListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SellListViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    internal inner class SellListViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        private var tvName: AppCompatTextView = view.findViewById(R.id.tvProName)
        private var tvPrice: AppCompatTextView = view.findViewById(R.id.tvProPrice)
        private var tvQty: AppCompatTextView = view.findViewById(R.id.tvProQuantity)

        fun bind(item: SellItem) {
            tvName.text = "Name: ${item.name}"
            tvPrice.text = "Price: ${item.price}"
            tvQty.text = "Quantity: ${item.quantity}"
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SellItem>() {

            override fun areItemsTheSame(
                oldItem: SellItem,
                newItem: SellItem
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: SellItem,
                newItem: SellItem
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}
