package com.example.testmobiledeveloperspefauzanpahlawan

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testmobiledeveloperspefauzanpahlawan.recyclerview.Image
import com.example.testmobiledeveloperspefauzanpahlawan.recyclerview.ImageAdapter
import com.example.testmobiledeveloperspefauzanpahlawan.recyclerview.ImageModel
import com.example.testmobiledeveloperspefauzanpahlawan.recyclerview.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = MainViewModel(ImageModel(this)).apply {
            generateImages()
        }

        val imageAdapter =
            ImageAdapter(mainViewModel.getImages()) { image -> onItemClicked(image) }.apply { notifyDataSetChanged() }
        rv_images.apply {
            layoutManager = LinearLayoutManager(this.context)
            rv_images.adapter = imageAdapter
        }
    }

    private fun onItemClicked(image: Image) {
        val intent = Intent(this@MainActivity, ImageDetailActivity::class.java)
        intent.putExtra(EXTRA_IMAGE, image)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}