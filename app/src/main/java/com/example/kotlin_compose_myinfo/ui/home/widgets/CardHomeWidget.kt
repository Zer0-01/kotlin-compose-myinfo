package com.example.kotlin_compose_myinfo.ui.home.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.kotlin_compose_myinfo.R
import com.example.kotlin_compose_myinfo.navigation.Screen

@Composable
fun CardHomeWidget(
    modifier: Modifier = Modifier,
    painter: Painter,
    text: String
) {
    Card(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(70.dp),
                painter = painter,
                contentDescription = null
            )
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Text(
                text = text
            )
        }
    }
}