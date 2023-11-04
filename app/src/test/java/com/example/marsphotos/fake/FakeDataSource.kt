package com.example.marsphotos.fake

import com.example.marsphotos.model.MarsPhoto

object FakeDataSource {
    const val idOne = 12
    const val idTwo = 13
    const val urlOne = "url.1"
    const val urlTwo = "url.2"

    val photosList = listOf<MarsPhoto>(
        MarsPhoto(id = idOne, imgSrc = urlOne),
        MarsPhoto(id = idTwo, imgSrc = urlTwo)
    )

}