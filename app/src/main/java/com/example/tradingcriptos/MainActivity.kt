package com.example.tradingcriptos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tradingcriptos.components.CriptoButton
import com.example.tradingcriptos.tutorial.MarioEstudiante
import com.example.tradingcriptos.tutorial.multiTable
import com.example.tradingcriptos.ui.theme.TradingCriptosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TradingCriptosTheme {
                CriptoButton()
            }
        }
    }
}
