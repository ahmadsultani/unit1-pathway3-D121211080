import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscardsultani.About
import com.example.businesscardsultani.AndroidLogo
import com.example.businesscardsultani.Contact
import com.example.businesscardsultani.ui.theme.BusinessCardSultaniTheme
import com.example.businesscardsultani.ui.theme.backgroundColor

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Spacer(modifier = Modifier.weight(1f))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            AndroidLogo()
            Spacer(modifier = Modifier.height(16.dp))
            About(
                name = "Ahmad Sultani",
                title = "Frontend Developer",
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Contact()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardPreview() {
    BusinessCardSultaniTheme {
        BusinessCard()
    }
}