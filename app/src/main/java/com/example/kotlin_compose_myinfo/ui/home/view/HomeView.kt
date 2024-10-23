package com.example.kotlin_compose_myinfo.ui.home.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kotlin_compose_myinfo.R
import com.example.kotlin_compose_myinfo.navigation.Screen
import com.example.kotlin_compose_myinfo.ui.home.widgets.CardHomeWidget

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(modifier = Modifier) { innerPadding ->
        FlowRow(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(8.dp),
            maxItemsInEachRow = 2,
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            CardHomeWidget(
                modifier = Modifier
                    .weight(1f)
                    .clickable { navController.navigate(Screen.Population.route) },
                painter = painterResource(R.drawable.icon_home_population),
                text = stringResource(R.string.home_population)
            )
            CardHomeWidget(
                modifier = Modifier
                    .weight(1f)
                    .clickable {},
                painter = painterResource(R.drawable.icon_home_education),
                text = stringResource(R.string.home_education)
            )
            CardHomeWidget(
                modifier = Modifier
                    .weight(1f)
                    .clickable {},
                painter = painterResource(R.drawable.icon_home_transportation),
                text = stringResource(R.string.home_transportation)
            )
            CardHomeWidget(
                modifier = Modifier
                    .weight(1f)
                    .clickable {},
                painter = painterResource(R.drawable.icon_home_healthcare),
                text = stringResource(R.string.home_healthcare)
            )
            CardHomeWidget(
                modifier = Modifier
                    .weight(1f)
                    .clickable {},
                painter = painterResource(R.drawable.icon_home_household),
                text = stringResource(R.string.home_household)
            )
            CardHomeWidget(
                modifier = Modifier
                    .weight(1f)
                    .clickable {},
                painter = painterResource(R.drawable.icon_home_financial),
                text = stringResource(R.string.home_financial)
            )
        }
    }
}