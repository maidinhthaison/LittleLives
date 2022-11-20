package ui.news.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J-\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\'2\u0006\u0010(\u001a\u00020)H\u0016\u00a2\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u0016H\u0016J\u001a\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J \u00100\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u00062"}, d2 = {"Lui/news/fragment/NewsFragment;", "Landroidx/fragment/app/Fragment;", "Lui/news/NewsAdapter$DownloadClickListener;", "()V", "_binding", "Lcom/jetpack/demo/databinding/FragmentNewsBinding;", "binding", "getBinding", "()Lcom/jetpack/demo/databinding/FragmentNewsBinding;", "newsAdapter", "Lui/news/NewsAdapter;", "newsViewModel", "Lui/news/NewsViewModel;", "getNewsViewModel", "()Lui/news/NewsViewModel;", "newsViewModel$delegate", "Lkotlin/Lazy;", "checkPermission", "", "permission", "", "hideProgressDialog", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDownloadClick", "fileName", "fileUrl", "fileType", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "setupRecyclerView", "showProgressDialog", "startDownloadingFile", "Companion", "app_developDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NewsFragment extends androidx.fragment.app.Fragment implements ui.news.NewsAdapter.DownloadClickListener {
    private com.jetpack.demo.databinding.FragmentNewsBinding _binding;
    private ui.news.NewsAdapter newsAdapter;
    private final kotlin.Lazy newsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final ui.news.fragment.NewsFragment.Companion Companion = null;
    
    private final com.jetpack.demo.databinding.FragmentNewsBinding getBinding() {
        return null;
    }
    
    private final ui.news.NewsViewModel getNewsViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showProgressDialog() {
    }
    
    private final void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDownloadClick(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String fileType) {
    }
    
    private final void startDownloadingFile(java.lang.String fileName, java.lang.String fileUrl, java.lang.String fileType) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final boolean checkPermission(java.lang.String permission) {
        return false;
    }
    
    public NewsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lui/news/fragment/NewsFragment$Companion;", "", "()V", "newInstance", "Lui/news/fragment/NewsFragment;", "app_developDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ui.news.fragment.NewsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}