package ui.news;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lui/news/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Ldata/repository/NewsRepository;", "(Ldata/repository/NewsRepository;)V", "_getNewsResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lui/news/GetNewsResult;", "getNewsResult", "Lkotlinx/coroutines/flow/SharedFlow;", "getGetNewsResult", "()Lkotlinx/coroutines/flow/SharedFlow;", "getListEvent", "", "context", "Landroid/content/Context;", "app_developDebug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableSharedFlow<ui.news.GetNewsResult> _getNewsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<ui.news.GetNewsResult> getNewsResult = null;
    private final data.repository.NewsRepository newsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<ui.news.GetNewsResult> getGetNewsResult() {
        return null;
    }
    
    public final void getListEvent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @javax.inject.Inject()
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    data.repository.NewsRepository newsRepository) {
        super();
    }
}