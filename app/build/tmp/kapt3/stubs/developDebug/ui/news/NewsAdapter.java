package ui.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0014\u0015\u0016\u0017B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lui/news/NewsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Ldata/response/ListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "downloadClickListener", "Lui/news/NewsAdapter$DownloadClickListener;", "(Landroid/content/Context;Lui/news/NewsAdapter$DownloadClickListener;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DownloadClickListener", "ItemDiffCallBack", "ItemViewHolder", "StickyViewHolder", "app_developDebug"})
public final class NewsAdapter extends androidx.recyclerview.widget.ListAdapter<data.response.ListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private android.content.Context context;
    private ui.news.NewsAdapter.DownloadClickListener downloadClickListener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ui.news.NewsAdapter.DownloadClickListener downloadClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lui/news/NewsAdapter$DownloadClickListener;", "", "onDownloadClick", "", "fileName", "", "fileUrl", "fileType", "app_developDebug"})
    public static abstract interface DownloadClickListener {
        
        public abstract void onDownloadClick(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        java.lang.String fileUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String fileType);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lui/news/NewsAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lui/news/NewsAdapter;Landroid/view/View;)V", "imvAction", "Landroidx/appcompat/widget/AppCompatImageView;", "imvEventBullet", "imvEventItem", "llItemAction", "Landroidx/appcompat/widget/LinearLayoutCompat;", "tvAction", "Landroidx/appcompat/widget/AppCompatTextView;", "tvEventDesc", "tvEventType", "bind", "", "item", "Ldata/response/GeneralItem;", "app_developDebug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private androidx.appcompat.widget.AppCompatTextView tvEventType;
        private androidx.appcompat.widget.AppCompatTextView tvEventDesc;
        private androidx.appcompat.widget.LinearLayoutCompat llItemAction;
        private androidx.appcompat.widget.AppCompatTextView tvAction;
        private androidx.appcompat.widget.AppCompatImageView imvAction;
        private androidx.appcompat.widget.AppCompatImageView imvEventItem;
        private androidx.appcompat.widget.AppCompatImageView imvEventBullet;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        data.response.GeneralItem item) {
        }
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lui/news/NewsAdapter$StickyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lui/news/NewsAdapter;Landroid/view/View;)V", "tvEventDate", "Landroidx/appcompat/widget/AppCompatTextView;", "bind", "", "item", "Ldata/response/DateItem;", "app_developDebug"})
    public final class StickyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private androidx.appcompat.widget.AppCompatTextView tvEventDate;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        data.response.DateItem item) {
        }
        
        public StickyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0017J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lui/news/NewsAdapter$ItemDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ldata/response/ListItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_developDebug"})
    public static final class ItemDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<data.response.ListItem> {
        
        @android.annotation.SuppressLint(value = {"DiffUtilEquals"})
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        data.response.ListItem oldItem, @org.jetbrains.annotations.NotNull()
        data.response.ListItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        data.response.ListItem oldItem, @org.jetbrains.annotations.NotNull()
        data.response.ListItem newItem) {
            return false;
        }
        
        public ItemDiffCallBack() {
            super();
        }
    }
}