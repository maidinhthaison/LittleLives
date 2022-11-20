package data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Ldata/repository/NewsRepository;", "", "appLocalDataSource", "Ldata/local/AppLocalDataSource;", "remoteDataSource", "Ldata/remote/NewsRemoteDataSource;", "(Ldata/local/AppLocalDataSource;Ldata/remote/NewsRemoteDataSource;)V", "getEventRepo", "Ldata/Result;", "Ldata/response/EventData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_developDebug"})
public final class NewsRepository {
    private final data.local.AppLocalDataSource appLocalDataSource = null;
    private final data.remote.NewsRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEventRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super data.Result<data.response.EventData>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    data.local.AppLocalDataSource appLocalDataSource, @org.jetbrains.annotations.NotNull()
    data.remote.NewsRemoteDataSource remoteDataSource) {
        super();
    }
}