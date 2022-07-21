package com.example.tradingcriptos.data.repositorie

import com.example.tradingcriptos.data.CriptosRemoteDataSource
import com.example.tradingcriptos.data.remote.models.Payload
import com.example.tradingcriptos.utils.DataState
import com.example.tradingcriptos.utils.ErrorResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CriptosRepositoryImpl @Inject constructor(private val remoteDataSource: CriptosRemoteDataSource) :
    CriptosRepository {

    override fun getCriptos(): Flow<DataState<List<Payload>, ErrorResponse>> {
        return flow { emit(remoteDataSource.getCriptos()) }
    }
}