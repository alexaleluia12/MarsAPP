package com.example.marsphotos.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto(val id: Int, @SerialName(value = "img_src") val imgSrc: String)