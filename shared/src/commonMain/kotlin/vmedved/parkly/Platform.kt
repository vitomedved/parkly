package vmedved.parkly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform