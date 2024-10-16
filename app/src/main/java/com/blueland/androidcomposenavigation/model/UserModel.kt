package com.blueland.androidcomposenavigation.model

import kotlinx.serialization.Serializable

@Serializable
data class UserModel(
    val nickname: String,
    val phoneNumber: String
)
