package vmedved.parkly.di

import org.koin.core.context.startKoin

fun initializeKoin() {
    startKoin {
        modules(appModule)
    }
}
