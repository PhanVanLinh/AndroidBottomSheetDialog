package vn.linh.androidbottomsheetdialog.bottomsheetwithrecyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_contact.view.*
import vn.linh.androidbottomsheetdialog.R

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ItemViewHolder>() {

    var contactItems: List<ContactItem>? = null
        set(value) {
            notifyDataSetChanged()
            field = value
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false))
    }

    override fun getItemCount(): Int {
        return contactItems?.size ?: 0
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemView.text_name.text = contactItems!![position].name
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}