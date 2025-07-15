package com.example.greetingcard.artgallery


import com.example.greetingcard.R
import java.util.Calendar
import java.util.Date

fun createSpecificDate(year: Int, month: Int, day: Int): Date {
    val calendar = Calendar.getInstance().apply {
        set(Calendar.YEAR, year)
        set(Calendar.MONTH, month - 1)  // Months are 0-based (0=January)
        set(Calendar.DAY_OF_MONTH, day)
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
    }
    return calendar.time
}

val GalleryData = listOf<GalleryPhoto>(
    GalleryPhoto(
        R.drawable.library_intricate_explorer_u1l9yetdahm_unsplash,
        "Free to use under the Unsplash License",
        createSpecificDate(2025,6,8),
        "The Morgan Library & Museum, Madison Avenue, New York, NY, USA",
        "A photo of a Library"
    ),
    GalleryPhoto(
        R.drawable.garden_pang_yuhao_xhtbjp2cs70_unsplash,
        "Free to use under the Unsplash License",
        createSpecificDate(2025,2,23),
        description = "A photo of a Garden"
    ),
    GalleryPhoto(
        R.drawable.tower_zhenyu_luo_xpburpkfwus_unsplash,
        "Free to use under the Unsplash License",
        createSpecificDate(2025,4,17),
        "Airport Boulevard, Changi Airport (SIN), Singapore",
        "A photo of a Eiffel Tower"
    ),
)
