package com.example.crypto_currency_app.data.entities.CoinInfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class CoinInfoResponse (
    @SerializedName("RAW")
    @Expose
    val coinPriceInfoJsonObject: JSONObject? = null
)