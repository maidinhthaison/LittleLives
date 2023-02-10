package data.remote

import data.Result
import data.remote.api.ApiAppService
import data.remote.response.CurrencyResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyRemoteDataSource @Inject constructor(
    private val apiAppService: ApiAppService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : BaseRemoteDataSource() {

    suspend fun getDataCurrency(currency: String):
            Result<CurrencyResponse> {
        return withContext(dispatcher) {
            getResult {
                apiAppService.callGetListCurrency(currency = currency)
            }
        }
    }

}