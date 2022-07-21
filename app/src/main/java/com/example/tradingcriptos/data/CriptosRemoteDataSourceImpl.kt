package com.example.tradingcriptos.data

import com.example.tradingcriptos.data.remote.api.BitsoApi
import com.example.tradingcriptos.data.remote.models.Payload
import com.example.tradingcriptos.utils.DataState
import com.example.tradingcriptos.utils.ErrorResponse
import javax.inject.Inject
import timber.log.Timber

class CriptosRemoteDataSourceImpl @Inject constructor(private val api: BitsoApi) : CriptosRemoteDataSource {

        override suspend fun getCriptos(): DataState<List<Payload>, ErrorResponse> {

            val response = api.getCriptos()

            try {

                if (response.isSuccessful) {

                    val criptos: List<Payload>? = response.body()?.payload
                    if (criptos != null) {

                        return DataState.Success(data = criptos)
                    } else {
                        return DataState.Error(
                            error = ErrorResponse(
                                status = 500,
                                errorCode = "Criptos are null",
                                details = "Criptos null details"
                            )
                        )
                    }
                } else {
                    return DataState.Error(
                        error = ErrorResponse(
                            status = 500,
                            errorCode = "Criptos request failed",
                            details = "Criptos request failed details"
                        )
                    )
                }
            } catch (e: Exception) {
                Timber.e(e)
                return DataState.Error(
                    error = ErrorResponse(
                        status = 500,
                        errorCode = "Another error code",
                        details = "Error details"
                    )
                )
            }
        }
    }
