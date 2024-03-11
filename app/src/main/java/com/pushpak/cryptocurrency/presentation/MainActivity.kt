package com.pushpak.cryptocurrency.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pushpak.cryptocurrency.presentation.coin_details.components.CoinDetailScreen
import com.pushpak.cryptocurrency.presentation.coin_list.components.CoinListScree
import com.pushpak.cryptocurrency.presentation.ui.theme.CryptoCurrencyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCurrencyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CoinListScree()
//                    val navController = rememberNavController()
//                    NavHost(
//                        navController = navController,
//                        startDestination = Screen.CoinListScreen.rout
//                    ){
//                        composable(
//                        route = Screen.CoinListScreen.rout
//                        ){
//                            CoinListScree(navController = navController)
//                        }
//                        composable(
//                            route = Screen.CoinDetailScreen.rout+"/{coinId}"
//                        ){
//                            CoinDetailScreen()
//                        }
//                   }
                }
            }
        }
    }
}

@Composable
fun Demo() {
    Text(text = "Hello Pushpak")
}


