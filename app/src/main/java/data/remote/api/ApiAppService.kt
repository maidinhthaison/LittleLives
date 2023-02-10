package data.remote.api

import data.remote.response.CurrencyResponse
import data.response.DownloadResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Streaming
import retrofit2.http.Url

interface ApiAppService {

    @GET("/api/v3/price/all_prices_for_mobile")
    suspend fun callGetListCurrency(
        @Query("counter_currency") currency: String
    ): CurrencyResponse

    @Streaming
    @GET
    suspend fun downloadFileWithUrl(@Url fileUrl: String): DownloadResponse
}