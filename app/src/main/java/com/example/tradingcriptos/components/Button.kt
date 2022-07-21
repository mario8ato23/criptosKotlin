package com.example.tradingcriptos.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tradingcriptos.ui.theme.TradingCriptosTheme

@Composable
fun CriptoButton() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Dame click >:D")
    }
}

@Preview("Button preview")
@Composable
fun ButtonPreviewDark() {
    TradingCriptosTheme {
        CriptoButton()
    }
}

@Preview("Button Ligh")
@Composable
fun ButtonPreviewLight() {
    TradingCriptosTheme(darkTheme = true) {
        CriptoButton()
    }
}
