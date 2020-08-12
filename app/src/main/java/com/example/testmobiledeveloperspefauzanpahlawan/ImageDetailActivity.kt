package com.example.testmobiledeveloperspefauzanpahlawan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testmobiledeveloperspefauzanpahlawan.recyclerview.Image
import kotlinx.android.synthetic.main.activity_image_detail.*

class ImageDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_detail)

        val image = intent.getParcelableExtra(MainActivity.EXTRA_IMAGE) as Image

        img_detail.setImageResource(image.imageId)
        tv_image_desc.text = image.imageDesc
    }
}