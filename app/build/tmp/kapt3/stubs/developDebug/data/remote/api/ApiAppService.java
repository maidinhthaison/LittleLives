package data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Ldata/remote/api/ApiAppService;", "", "callGetListCurrency", "Ldata/remote/response/CurrencyResponse;", "currency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFileWithUrl", "Ldata/response/DownloadResponse;", "fileUrl", "app_developDebug"})
public abstract interface ApiAppService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v3/price/all_prices_for_mobile")
    public abstract java.lang.Object callGetListCurrency(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "counter_currency")
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super data.remote.response.CurrencyResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    @retrofit2.http.Streaming()
    public abstract java.lang.Object downloadFileWithUrl(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String fileUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super data.response.DownloadResponse> p1);
}