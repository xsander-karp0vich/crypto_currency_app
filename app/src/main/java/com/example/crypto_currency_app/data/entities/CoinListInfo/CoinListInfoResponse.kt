package com.example.crypto_currency_app.data.entities.CoinListInfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinListInfoResponse(
    @SerializedName("Data")
    @Expose
    val data: List<Datum>? = null
)