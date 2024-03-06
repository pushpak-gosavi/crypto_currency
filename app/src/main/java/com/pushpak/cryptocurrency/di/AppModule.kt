package com.pushpak.cryptocurrency.di

import com.pushpak.cryptocurrency.common.Constants
import com.pushpak.cryptocurrency.data.remote.CoinPaprikAPI
import com.pushpak.cryptocurrency.data.repository.CoinRepositoryImpl
import com.pushpak.cryptocurrency.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaAPI():CoinPaprikAPI{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinPaprikaRepository(api: CoinPaprikAPI) : CoinRepository{
        return CoinRepositoryImpl(api)
    }
}