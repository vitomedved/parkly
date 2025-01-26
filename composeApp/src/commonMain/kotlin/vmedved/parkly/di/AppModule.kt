package vmedved.parkly.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import vmedved.parkly.feature.registration.RegistrationViewModel

val appModule = module {
    viewModelOf(::RegistrationViewModel)
}
