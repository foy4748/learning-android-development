package com.example.greetingcard.artgallery

import androidx.annotation.DrawableRes
import java.time.LocalDate
import java.util.Date

data class GalleryPhoto(
    @DrawableRes val resourceId: Int,
    val licenseType: String,
    val publishDate: Date,
    val location: String? = null,
    val description: String? = null
)