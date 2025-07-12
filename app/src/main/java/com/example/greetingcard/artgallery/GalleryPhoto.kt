package com.example.greetingcard.artgallery

import java.time.LocalDate
import java.util.Date

data class GalleryPhoto(
    val resourceId: Int,
    val licenseType: String,
    val publishDate: Date,
    val location: String? = null
)