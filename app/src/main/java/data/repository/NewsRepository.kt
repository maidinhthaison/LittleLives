package data.repository

import android.content.Context
import data.Result
import data.local.AppLocalDataSource
import data.remote.NewsRemoteDataSource
import data.response.EventData
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val appLocalDataSource: AppLocalDataSource,
    private val remoteDataSource: NewsRemoteDataSource) {
    suspend fun getEventRepo(context: Context): Result<EventData?> {
        return appLocalDataSource.getNewsEvent(context)
    }

}