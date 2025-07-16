package com.example.greetingcard.topicgrid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val associatedCourses: Int,
    @DrawableRes val imgId: Int
)