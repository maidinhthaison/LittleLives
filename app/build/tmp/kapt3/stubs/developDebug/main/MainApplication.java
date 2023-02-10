package main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lmain/MainApplication;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Ldata/local/ItemToSellDB;", "getDatabase", "()Ldata/local/ItemToSellDB;", "database$delegate", "Lkotlin/Lazy;", "repository", "Ldata/repository/SellItemRepository;", "getRepository", "()Ldata/repository/SellItemRepository;", "repository$delegate", "workerFactory", "Landroidx/hilt/work/HiltWorkerFactory;", "getWorkerFactory", "()Landroidx/hilt/work/HiltWorkerFactory;", "setWorkerFactory", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "onCreate", "", "Companion", "app_developDebug"})
@dagger.hilt.android.HiltAndroidApp()
public final class MainApplication extends android.app.Application implements androidx.work.Configuration.Provider {
    @javax.inject.Inject()
    public androidx.hilt.work.HiltWorkerFactory workerFactory;
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    private static main.MainApplication instance;
    @org.jetbrains.annotations.NotNull()
    public static final main.MainApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.hilt.work.HiltWorkerFactory getWorkerFactory() {
        return null;
    }
    
    public final void setWorkerFactory(@org.jetbrains.annotations.NotNull()
    androidx.hilt.work.HiltWorkerFactory p0) {
    }
    
    private final data.local.ItemToSellDB getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final data.repository.SellItemRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
    
    public MainApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lmain/MainApplication$Companion;", "", "()V", "<set-?>", "Lmain/MainApplication;", "instance", "getInstance", "()Lmain/MainApplication;", "setInstance", "(Lmain/MainApplication;)V", "app_developDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final main.MainApplication getInstance() {
            return null;
        }
        
        private final void setInstance(main.MainApplication p0) {
        }
        
        private Companion() {
            super();
        }
    }
}