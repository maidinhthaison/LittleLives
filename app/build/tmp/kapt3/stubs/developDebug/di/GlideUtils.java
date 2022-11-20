package di;

import java.lang.System;

@com.bumptech.glide.annotation.GlideModule()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldi/GlideUtils;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "cacheSize", "", "applyOptions", "", "context", "Landroid/content/Context;", "builder", "Lcom/bumptech/glide/GlideBuilder;", "isManifestParsingEnabled", "", "loadImage", "url", "", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "registerComponents", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "CustomBaseGlideUrlLoader", "app_developDebug"})
public final class GlideUtils extends com.bumptech.glide.module.AppGlideModule {
    
    /**
     * Setting memory cache size 10M
     */
    private final long cacheSize = 10485760L;
    
    @java.lang.Override()
    public void applyOptions(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.GlideBuilder builder) {
    }
    
    /**
     * Register a BaseGlideUrlLoader of String type
     */
    @java.lang.Override()
    public void registerComponents(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Glide glide, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Registry registry) {
    }
    
    /**
     * Close parsing Android Manifest
     */
    @java.lang.Override()
    public boolean isManifestParsingEnabled() {
        return false;
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView imageView) {
    }
    
    public GlideUtils() {
        super();
    }
    
    /**
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B-\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\u0002\u0010\tJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldi/GlideUtils$CustomBaseGlideUrlLoader;", "Lcom/bumptech/glide/load/model/stream/BaseGlideUrlLoader;", "", "concreteLoader", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "modelCache", "Lcom/bumptech/glide/load/model/ModelCache;", "(Lcom/bumptech/glide/load/model/ModelLoader;Lcom/bumptech/glide/load/model/ModelCache;)V", "pattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getUrl", "model", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "Companion", "app_developDebug"})
    public static final class CustomBaseGlideUrlLoader extends com.bumptech.glide.load.model.stream.BaseGlideUrlLoader<java.lang.String> {
        
        /**
         * Url The matching rules of 6550
         */
        private final java.util.regex.Pattern pattern = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.bumptech.glide.load.model.ModelCache<java.lang.String, com.bumptech.glide.load.model.GlideUrl> urlCache = null;
        
        /**
         * The default is private and exposed to Java calls through the @JvmField annotation
         */
        @org.jetbrains.annotations.NotNull()
        public static final com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.String, java.io.InputStream> factory = null;
        @org.jetbrains.annotations.NotNull()
        public static final di.GlideUtils.CustomBaseGlideUrlLoader.Companion Companion = null;
        
        /**
         * Control the size of the image to be loaded
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String getUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String model, int width, int height, @org.jetbrains.annotations.Nullable()
        com.bumptech.glide.load.Options options) {
            return null;
        }
        
        @java.lang.Override()
        public boolean handles(@org.jetbrains.annotations.NotNull()
        java.lang.String model) {
            return false;
        }
        
        public CustomBaseGlideUrlLoader(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> concreteLoader, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.model.ModelCache<java.lang.String, com.bumptech.glide.load.model.GlideUrl> modelCache) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Ldi/GlideUtils$CustomBaseGlideUrlLoader$Companion;", "", "()V", "factory", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "", "Ljava/io/InputStream;", "urlCache", "Lcom/bumptech/glide/load/model/ModelCache;", "Lcom/bumptech/glide/load/model/GlideUrl;", "getUrlCache", "()Lcom/bumptech/glide/load/model/ModelCache;", "app_developDebug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.bumptech.glide.load.model.ModelCache<java.lang.String, com.bumptech.glide.load.model.GlideUrl> getUrlCache() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}