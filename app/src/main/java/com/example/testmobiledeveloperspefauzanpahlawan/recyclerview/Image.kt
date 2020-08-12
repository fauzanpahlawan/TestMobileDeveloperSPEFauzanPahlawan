package com.example.testmobiledeveloperspefauzanpahlawan.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val imageId: Int,
    val imageDesc: String
) : Parcelable