package di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Ldi/NewsRepositoryModule;", "", "()V", "provideCurrencyRepository", "Ldata/repository/CurrencyRepository;", "localDataSource", "Ldata/local/AppLocalDataSource;", "remoteDataSource", "Ldata/remote/CurrencyRemoteDataSource;", "provideNewsRepository", "Ldata/repository/NewsRepository;", "Ldata/remote/NewsRemoteDataSource;", "app_developDebug"})
@dagger.Module()
public final class NewsRepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final di.NewsRepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final data.repository.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull()
    data.local.AppLocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    data.remote.NewsRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final data.repository.CurrencyRepository provideCurrencyRepository(@org.jetbrains.annotations.NotNull()
    data.local.AppLocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    data.remote.CurrencyRemoteDataSource remoteDataSource) {
        return null;
    }
    
    private NewsRepositoryModule() {
        super();
    }
}