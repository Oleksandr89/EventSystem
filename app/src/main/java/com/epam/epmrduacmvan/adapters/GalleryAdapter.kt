package com.epam.epmrduacmvan.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.epam.epmrduacmvan.R
import kotlinx.android.synthetic.main.image_item.view.*

class GalleryAdapter(private val listItem: List<String>) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(context!!)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.imageView_gallery

        fun bind(context: Context) {

            val imagePosition = listItem[adapterPosition]

            Glide.with(context)
                .load(imagePosition)
                .into(image)
        }
    }
}