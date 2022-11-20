package data.remote

import data.remote.api.ApiAppService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class NewsRemoteDataSource @Inject constructor(
    private val apiAppService: ApiAppService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : BaseRemoteDataSource() {
    //Implement the calling restful api for news (if have)

}