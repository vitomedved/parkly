package vmedved.parkly.feature.registration

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun RegistrationScreen() {
    val viewModel = koinViewModel<RegistrationViewModel>()

    Text("Text from VM: ${viewModel.getText()}")
}
