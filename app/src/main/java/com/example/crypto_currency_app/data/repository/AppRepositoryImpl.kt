package com.example.crypto_currency_app.data.repository

import com.example.crypto_currency_app.data.api.ApiFactory

object AppRepositoryImpl :AppRepository {

    override fun getTopCoinsInfo() {
        ApiFactory.apiService.getTopCoinsInfo()
    }


}