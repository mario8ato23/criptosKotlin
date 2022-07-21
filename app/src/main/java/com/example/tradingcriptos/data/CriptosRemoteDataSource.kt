package com.example.tradingcriptos.data

import com.example.tradingcriptos.data.remote.models.Payload
import com.example.tradingcriptos.utils.DataState
import com.example.tradingcriptos.utils.ErrorResponse

interface CriptosRemoteDataSource {
    suspend fun getCriptos(): DataState<List<Payload>, ErrorResponse>
}