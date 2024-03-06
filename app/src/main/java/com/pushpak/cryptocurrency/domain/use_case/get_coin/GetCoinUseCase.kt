package com.pushpak.cryptocurrency.domain.use_case.get_coin

import com.pushpak.cryptocurrency.common.Resource
import com.pushpak.cryptocurrency.data.remote.dto.toCoinDetail
import com.pushpak.cryptocurrency.domain.model.CoinDetail
import com.pushpak.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId:String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        }catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage?:"UnExpected error occurred!"))
        }
        catch (e:IOException){
            emit(Resource.Error("Couldn't reach server, Please check the internet"))
        }
    }
}