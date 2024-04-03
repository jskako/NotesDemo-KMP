import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.screen.home.HomeScreen
import ui.theme.darkColorScheme
import ui.theme.lightColorScheme

@Composable
@Preview
fun App() {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) darkColorScheme else lightColorScheme
    ) {
        Navigator(
            screen = HomeScreen()
        ) {
            SlideTransition(navigator = it)
        }
    }
}