package com.example.tradingcriptos.domain.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tradingcriptos.data.remote.models.Payload
import com.example.tradingcriptos.domain.usecases.CriptosUseCase
import com.example.tradingcriptos.utils.DataState
import com.example.tradingcriptos.utils.ErrorResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@HiltViewModel
class CriptosViewModel @Inject constructor(private val useCase: CriptosUseCase) : ViewModel() {

    fun getCriptos(
        onSuccess: (successResponse: List<Payload>) -> Unit,
        onError: (errorResponse: ErrorResponse) -> Unit
    ) {
        useCase.getCriptos()
            .onEach { response ->
                when (response) {
                    is DataState.Success -> {
                        onSuccess(response.data)
                    }
                    is DataState.Error -> {
                        onError(response.error)
                    }
                    else -> Unit
                }
            }.launchIn(viewModelScope)
    }
}
