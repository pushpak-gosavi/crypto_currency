package com.pushpak.cryptocurrency.presentation

sealed class Screen(val rout:String) {
     data object CoinListScreen : Screen(rout = "coin_list_screen")
     //object CoinDetailScreen : Screen(rout = "coin_detail_screen")
}