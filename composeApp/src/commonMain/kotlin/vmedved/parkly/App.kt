package vmedved.parkly

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import vmedved.parkly.di.initializeKoin
import vmedved.parkly.feature.registration.navigation.RegistrationRoute
import vmedved.parkly.feature.registration.navigation.registrationRoute

@Composable
@Preview
fun App() {
    initializeKoin()

    MaterialTheme {
        val controller = rememberNavController()
        NavHost(navController = controller, startDestination = RegistrationRoute) {
            registrationRoute()
        }
    }
}
