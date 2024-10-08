package com.reyson.spotd

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform