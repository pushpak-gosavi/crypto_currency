package com.pushpak.cryptocurrency.data.repository

import com.pushpak.cryptocurrency.data.remote.CoinPaprikAPI
import com.pushpak.cryptocurrency.data.remote.dto.CoinDetailDto
import com.pushpak.cryptocurrency.data.remote.dto.CoinDto
import com.pushpak.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikAPI,
):CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}