package data.remote.api

import data.response.DownloadResponse
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

interface ApiAppService {
    //Implement call api service here(if have) like that
    @Streaming
    @GET
    suspend fun downloadFileWithUrl(@Url fileUrl: String): DownloadResponse
}