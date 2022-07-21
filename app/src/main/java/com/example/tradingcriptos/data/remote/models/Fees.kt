package com.example.tradingcriptos.data.remote.models
import com.google.gson.annotations.SerializedName

data class Fees (

	@SerializedName("flat_rate") val flat_rate : Flat_rate,
	@SerializedName("structure") val structure : List<Structure>
)