// Generated by Dagger (https://dagger.dev).
package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import data.local.AppLocalDataSource;
import data.remote.NewsRemoteDataSource;
import data.repository.NewsRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsRepositoryModule_ProvideNewsRepositoryFactory implements Factory<NewsRepository> {
  private final Provider<AppLocalDataSource> localDataSourceProvider;

  private final Provider<NewsRemoteDataSource> remoteDataSourceProvider;

  public NewsRepositoryModule_ProvideNewsRepositoryFactory(
      Provider<AppLocalDataSource> localDataSourceProvider,
      Provider<NewsRemoteDataSource> remoteDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public NewsRepository get() {
    return provideNewsRepository(localDataSourceProvider.get(), remoteDataSourceProvider.get());
  }

  public static NewsRepositoryModule_ProvideNewsRepositoryFactory create(
      Provider<AppLocalDataSource> localDataSourceProvider,
      Provider<NewsRemoteDataSource> remoteDataSourceProvider) {
    return new NewsRepositoryModule_ProvideNewsRepositoryFactory(localDataSourceProvider, remoteDataSourceProvider);
  }

  public static NewsRepository provideNewsRepository(AppLocalDataSource localDataSource,
      NewsRemoteDataSource remoteDataSource) {
    return Preconditions.checkNotNullFromProvides(NewsRepositoryModule.INSTANCE.provideNewsRepository(localDataSource, remoteDataSource));
  }
}
