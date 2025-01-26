package vmedved.parkly.feature.registration.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import vmedved.parkly.feature.registration.RegistrationScreen

@Serializable
data object RegistrationRoute

fun NavGraphBuilder.registrationRoute() {
    composable<RegistrationRoute> {
        RegistrationScreen()
    }
}
