package com.example.kotlin_compose_myinfo.ui.home.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kotlin_compose_myinfo.R

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        modifier = Modifier

    ) { innerPadding ->
        FlowRow(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(8.dp),
            maxItemsInEachRow = 2,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Card {
                Column(
                    modifier = Modifier
                        .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .size(70.dp),
                        painter = painterResource(R.drawable.icon_home_population),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.padding(vertical = 4.dp))
                    Text(
                        text = stringResource(R.string.home_population)
                    )
                }
            }

            Card {
                Column(
                    modifier = Modifier
                        .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .size(70.dp),
                        painter = painterResource(R.drawable.icon_home_education),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.padding(vertical = 4.dp))
                    Text(
                        text = stringResource(R.string.home_education)
                    )
                }
            }
            Card {
                Column(
                    modifier = Modifier
                        .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .size(70.dp),
                        painter = painterResource(R.drawable.icon_home_transportation),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.padding(vertical = 4.dp))
                    Text(
                        text = stringResource(R.string.home_transportation)
                    )
                }
            }

            Card {
                Column(
                    modifier = Modifier
                        .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .size(70.dp),
                        painter = painterResource(R.drawable.icon_home_transportation),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.padding(vertical = 4.dp))
                    Text(
                        text = stringResource(R.string.home_transportation)
                    )
                }
            }
        }
    }

}