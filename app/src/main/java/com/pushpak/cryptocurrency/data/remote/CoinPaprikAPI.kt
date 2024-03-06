package com.pushpak.cryptocurrency.data.remote

import com.pushpak.cryptocurrency.data.remote.dto.CoinDetailDto
import com.pushpak.cryptocurrency.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikAPI {
    @GET("/v1/coins")
    suspend fun getCoins():List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path(value = "coinId") coinId:String):CoinDetailDto
}