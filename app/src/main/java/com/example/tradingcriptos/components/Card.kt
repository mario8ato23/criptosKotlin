package com.example.tradingcriptos.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tradingcriptos.R
import com.example.tradingcriptos.ui.theme.TradingCriptosTheme

@Composable
fun RightContent() {
    Column(modifier = Modifier
        .padding(12.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Roma norte", style = MaterialTheme.typography.subtitle2)
        Text(text = "Hora de llegada: 00:00", style = MaterialTheme.typography.subtitle1)
    }
}

@Composable
fun leftContent() {
    Column(modifier = Modifier
        .fillMaxHeight()
        .background((MaterialTheme.colors.primary)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "1")
        Text(text = "Tarea")
        Text(text = "2")
        Text(text = "Productos")
    }
}

@Composable
fun CardContainer() {
    androidx.compose.material.Surface(
        shape = RoundedCornerShape(topStart = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .height(100.dp)
                .width(300.dp)
                .background(Color(0xFFFFFFFF))
        ) {
            leftContent()
            RightContent()
        }
    }
}

@Composable
fun BoxCard() {
    Box(modifier = Modifier
        .width(100.dp)
        .height(300.dp)) {
        Image(
            painter = painterResource(id = R.drawable.imagebg),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center).fillMaxSize()
        )
    }
}

@Preview("Card")
@Composable
fun CardPreview() {
    TradingCriptosTheme {
        BoxCard()
    }
}
