package com.pushpak.cryptocurrency.presentation.coin_list

import com.pushpak.cryptocurrency.domain.model.Coin

data class CoinListState(
    val isLoading:Boolean = false,
    val coins:List<Coin> = emptyList(),
    val error: String = ""
)
