package di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import data.local.AppLocalDataSource
import data.remote.NewsRemoteDataSource
import data.repository.NewsRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NewsRepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        localDataSource: AppLocalDataSource,
        remoteDataSource: NewsRemoteDataSource,
    ) = NewsRepository(localDataSource, remoteDataSource)

}