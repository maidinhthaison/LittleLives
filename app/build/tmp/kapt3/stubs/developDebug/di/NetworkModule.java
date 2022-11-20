package di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldi/NetworkModule;", "", "()V", "CONNECT_TIMEOUT", "", "getUnsafeOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "provideAuthInterceptorOkHttpClient", "Lokhttp3/OkHttpClient;", "authInterceptor", "Ldata/remote/api/interceptor/AppInterceptor;", "provideAuthService", "Ldata/remote/api/ApiAppService;", "client", "gsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideGsonFactory", "provideHttpClient", "interceptor", "Lokhttp3/Interceptor;", "app_developDebug"})
@dagger.Module()
public final class NetworkModule {
    private static final int CONNECT_TIMEOUT = 30;
    @org.jetbrains.annotations.NotNull()
    public static final di.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @di.qualifier.AuthInterceptorOkHttpClient()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideAuthInterceptorOkHttpClient(@org.jetbrains.annotations.NotNull()
    data.remote.api.interceptor.AppInterceptor authInterceptor) {
        return null;
    }
    
    private final okhttp3.OkHttpClient provideHttpClient(okhttp3.Interceptor interceptor) {
        return null;
    }
    
    private final okhttp3.OkHttpClient.Builder getUnsafeOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final data.remote.api.ApiAppService provideAuthService(@org.jetbrains.annotations.NotNull()
    @di.qualifier.AuthInterceptorOkHttpClient()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideCoroutineDispatcher() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}