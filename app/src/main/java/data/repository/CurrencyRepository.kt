package data.repository

import data.Result
import data.local.AppLocalDataSource
import data.remote.CurrencyRemoteDataSource
import data.remote.response.CurrencyResponse
import javax.inject.Inject

class CurrencyRepository @Inject constructor(
    private val appLocalDataSource: AppLocalDataSource,
    private val remoteDataSource: CurrencyRemoteDataSource
) {
    suspend fun getCurrencyRepo(counter_currency: String): Result<CurrencyResponse> {
        return remoteDataSource.getDataCurrency(counter_currency)
    }
}