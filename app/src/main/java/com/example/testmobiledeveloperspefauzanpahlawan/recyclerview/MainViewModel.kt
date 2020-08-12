package com.example.testmobiledeveloperspefauzanpahlawan.recyclerview

class MainViewModel(private val imageModel: ImageModel) {
    fun generateImages() = imageModel.generateImages()
    fun getImages() = imageModel.getImages()
}