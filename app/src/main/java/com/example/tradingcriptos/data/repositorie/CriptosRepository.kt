package com.example.tradingcriptos.data.repositorie

import com.example.tradingcriptos.data.remote.models.Payload
import com.example.tradingcriptos.utils.DataState
import com.example.tradingcriptos.utils.ErrorResponse
import kotlinx.coroutines.flow.Flow

interface CriptosRepository {
    /**
     * @see getCriptos
     */
    fun getCriptos(): Flow<DataState<List<Payload>, ErrorResponse>>
}
