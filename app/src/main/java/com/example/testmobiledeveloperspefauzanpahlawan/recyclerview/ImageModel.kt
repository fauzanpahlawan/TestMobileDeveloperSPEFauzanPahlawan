package com.example.testmobiledeveloperspefauzanpahlawan.recyclerview

import android.content.Context
import com.example.testmobiledeveloperspefauzanpahlawan.R

class ImageModel(private val context: Context) {
    private val images: ArrayList<Image> = ArrayList()

    fun generateImages() {
        images.add(Image(R.drawable.img01, "image 01"))
        images.add(Image(R.drawable.img02, "image 02"))
        images.add(Image(R.drawable.img03, "image 03"))
        images.add(Image(R.drawable.img04, "image 04"))
        images.add(Image(R.drawable.img05, "image 05"))
        images.add(Image(R.drawable.img06, "image 06"))
        images.add(Image(R.drawable.img07, "image 07"))
        images.add(Image(R.drawable.img08, "image 08"))
        images.add(Image(R.drawable.img09, "image 09"))
        images.add(Image(R.drawable.img10, "image 10"))
    }

    fun getImages(): ArrayList<Image> {
        return images
    }
}
