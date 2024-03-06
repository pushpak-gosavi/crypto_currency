package com.pushpak.cryptocurrency.domain.repository

import com.pushpak.cryptocurrency.data.remote.dto.CoinDetailDto
import com.pushpak.cryptocurrency.data.remote.dto.CoinDto
import com.pushpak.cryptocurrency.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(coinId:String):CoinDetailDto
}