package com.example.tradingcriptos.data.remote.api

import com.example.tradingcriptos.data.remote.models.BitsoResponse
import retrofit2.Response
import retrofit2.http.GET

interface BitsoApi {

    @GET("/v3/available/_books")
    suspend fun getCriptos(): Response<BitsoResponse>
}