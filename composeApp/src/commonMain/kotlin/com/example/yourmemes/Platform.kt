package com.example.yourmemes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform