package com.pushpak.cryptocurrency.presentation.coin_details

import com.pushpak.cryptocurrency.domain.model.CoinDetail

data class CoinState(
    val isLoading: Boolean = false,
    val data: CoinDetail? = null,
    val isError: String = ""
)
