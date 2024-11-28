package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Stay Informed, Stay Ahead",
        description = "Get the latest news from around the world, tailored to your interests, all in one place.",
        image = R.drawable.img_into_1
    ),
    Page(
        title = "Personalized News Feed",
        description = " Select your favorite topics and enjoy a curated feed of stories that matter to you.",
        image = R.drawable.img_into_2
    ),
    Page(
        title = "Instant Notifications",
        description = " Never miss a breaking story with real-time alerts delivered straight to your device.",
        image = R.drawable.img_into_3
    ),
)
