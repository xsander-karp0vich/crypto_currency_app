package com.example.crypto_currency_app.data.api

import com.example.crypto_currency_app.data.entities.CoinInfo.CoinInfoResponse
import com.example.crypto_currency_app.data.entities.CoinListInfo.CoinListInfoResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_KEY) api_key:String = API_KEY,
        @Query(QUERY_PARAM_LIMIT) limit:Int = 10,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym:String = CURRENCY
    ): Single<CoinListInfoResponse>
    
    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_API_KEY) api_key:String = API_KEY,
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms:String,
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms:String = CURRENCY,
        ):Single<CoinInfoResponse>

    companion object{
        private const val API_KEY = "d731c4640b3e8dfecd58795ba09c418470b1f7332c1e6f067de725146c8cc511"

        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"

        private const val CURRENCY = "USD"

        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"

    }
}

object ApiFactory {

    private const val BASE_URL: String = "https://min-api.cryptocompare.com/data/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}