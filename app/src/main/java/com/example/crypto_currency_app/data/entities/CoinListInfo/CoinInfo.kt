package com.example.crypto_currency_app.data.entities.CoinListInfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfo(

    @SerializedName("Id")
    @Expose
    val id: String? = null,

    @SerializedName("Name")
    @Expose
    val name: String? = null,

    @SerializedName("FullName")
    @Expose
    val fullName: String? = null,

    @SerializedName("ImageUrl")
    @Expose
    val imageUrl: String? = null

)