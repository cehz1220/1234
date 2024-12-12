package com.example.myapplication1.data.models

/**
 * User - data class for fetching and transform data for server
 */
data class User(
    val id: Int,
    val name: String,
    val login: String,
    val password: String,
    val isAdmin: Boolean
)
