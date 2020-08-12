package com.example.testmobiledeveloperspefauzanpahlawan.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testmobiledeveloperspefauzanpahlawan.R
import kotlinx.android.synthetic.main.item_image.view.*

class ImageAdapter(
    private val images: ArrayList<Image>,
    private val onItemClickListener: (Image) -> Unit
) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        )

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = images[position]
        holder.bind(image, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return if (images.isNotEmpty()) images.size else 0
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(image: Image, onClickListener: (Image) -> Unit) {
            with(itemView) {
                itemView.img_item.setImageResource(image.imageId)
                itemView.setOnClickListener { onClickListener(image) }
            }
        }
    }
}