package com.vharya.aktifitas2b

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(
    private val context: Context,
    private val titles: ArrayList<String>,
    private val images: ArrayList<Int>,
) : BaseAdapter() {

    override fun getCount(): Int {
        return titles.size
    }

    override fun getItem(position: Int): Any {
        return titles[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView

        if (itemView == null) {
            val inflater = LayoutInflater.from(context)
            itemView = inflater.inflate(R.layout.item_grid, parent, false)

            val imageView = itemView.findViewById<ImageView>(R.id.item_image)
            val textView = itemView.findViewById<TextView>(R.id.item_name)

            imageView.setImageResource(images[position])
            textView.text = titles[position]
        }

        return itemView!!
    }
}