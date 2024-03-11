package com.pushpak.cryptocurrency.presentation.coin_details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.pushpak.cryptocurrency.common.Constants
import com.pushpak.cryptocurrency.common.Resource
import com.pushpak.cryptocurrency.domain.use_case.get_coin.GetCoinUseCase
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class CoinDetailViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase,
    //stateHandle: SavedStateHandle
) : ViewModel() {
//    private val _state = mutableStateOf(CoinDetailState())
//    val state: State<CoinDetailState> = _state
//
//    init {
//        stateHandle.get<String>(Constants.PARAM_COIN_ID)?.let { getCoinById ->
//            getCoinDetail(getCoinById = getCoinById)
//        }
//    }
//
//    private fun getCoinDetail(getCoinById: String) {
//        getCoinUseCase(getCoinById).onEach { result ->
//            when (result) {
//                is Resource.Loading ->
//                    _state.value = CoinDetailState(isLoading = true)
//
//                is Resource.Success ->
//                    _state.value = CoinDetailState(data = result.data)
//
//                is Resource.Error ->
//                    _state.value = CoinDetailState(
//                        isError = result.message ?: "Unexpected error occurred!"
//                    )
//            }
//        }
//    }
}