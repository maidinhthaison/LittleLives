// Generated by Dagger (https://dagger.dev).
package main;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.HiltWrapper_WorkerFactoryModule;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.ListenableWorker;
import com.google.gson.Gson;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import data.local.AppLocalDataSource;
import data.remote.NewsRemoteDataSource;
import data.remote.api.ApiAppService;
import data.remote.api.interceptor.AppInterceptor;
import data.repository.NewsRepository;
import di.LocalModule;
import di.LocalModule_ProvideDataStoreFactory;
import di.LocalModule_ProvideGsonFactory;
import di.NetworkModule;
import di.NetworkModule_ProvideAuthInterceptorOkHttpClientFactory;
import di.NetworkModule_ProvideAuthServiceFactory;
import di.NetworkModule_ProvideCoroutineDispatcherFactory;
import di.NetworkModule_ProvideGsonFactoryFactory;
import di.NewsRepositoryModule;
import di.NewsRepositoryModule_ProvideNewsRepositoryFactory;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import ui.checkin.fragment.CheckInFragment;
import ui.inbox.fragment.InboxFragment;
import ui.main.MainActivity;
import ui.more.fragment.ViewMoreFragment;
import ui.news.NewsViewModel;
import ui.news.NewsViewModel_HiltModules_KeyModule_ProvideFactory;
import ui.news.fragment.NewsFragment;
import ui.portfolio.fragment.PortfolioFragment;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object dataStoreOfPreferences = new MemoizedSentinel();

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object apiAppService = new MemoizedSentinel();

  private volatile Object newsRepository = new MemoizedSentinel();

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private HiltWorkerFactory hiltWorkerFactory() {
    return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(Collections.<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>emptyMap());
  }

  private DataStore<Preferences> dataStoreOfPreferences() {
    Object local = dataStoreOfPreferences;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = dataStoreOfPreferences;
        if (local instanceof MemoizedSentinel) {
          local = LocalModule_ProvideDataStoreFactory.provideDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          dataStoreOfPreferences = DoubleCheck.reentrantCheck(dataStoreOfPreferences, local);
        }
      }
    }
    return (DataStore<Preferences>) local;
  }

  private Gson gson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = LocalModule_ProvideGsonFactory.provideGson();
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private AppLocalDataSource appLocalDataSource() {
    return new AppLocalDataSource(dataStoreOfPreferences(), NetworkModule_ProvideCoroutineDispatcherFactory.provideCoroutineDispatcher(), gson());
  }

  private OkHttpClient authInterceptorOkHttpClientOkHttpClient() {
    return NetworkModule_ProvideAuthInterceptorOkHttpClientFactory.provideAuthInterceptorOkHttpClient(new AppInterceptor());
  }

  private ApiAppService apiAppService() {
    Object local = apiAppService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiAppService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideAuthServiceFactory.provideAuthService(authInterceptorOkHttpClientOkHttpClient(), NetworkModule_ProvideGsonFactoryFactory.provideGsonFactory());
          apiAppService = DoubleCheck.reentrantCheck(apiAppService, local);
        }
      }
    }
    return (ApiAppService) local;
  }

  private NewsRemoteDataSource newsRemoteDataSource() {
    return new NewsRemoteDataSource(apiAppService(), NetworkModule_ProvideCoroutineDispatcherFactory.provideCoroutineDispatcher());
  }

  private NewsRepository newsRepository() {
    Object local = newsRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = newsRepository;
        if (local instanceof MemoizedSentinel) {
          local = NewsRepositoryModule_ProvideNewsRepositoryFactory.provideNewsRepository(appLocalDataSource(), newsRemoteDataSource());
          newsRepository = DoubleCheck.reentrantCheck(newsRepository, local);
        }
      }
    }
    return (NewsRepository) local;
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
    injectMainApplication2(mainApplication);
  }

  private MainApplication injectMainApplication2(MainApplication instance) {
    MainApplication_MembersInjector.injectWorkerFactory(instance, hiltWorkerFactory());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_WorkerFactoryModule(
        HiltWrapper_WorkerFactoryModule hiltWrapper_WorkerFactoryModule) {
      Preconditions.checkNotNull(hiltWrapper_WorkerFactoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder localModule(LocalModule localModule) {
      Preconditions.checkNotNull(localModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder newsRepositoryModule(NewsRepositoryModule newsRepositoryModule) {
      Preconditions.checkNotNull(newsRepositoryModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private Set<String> keySetSetOfString() {
        return Collections.<String>singleton(NewsViewModel_HiltModules_KeyModule_ProvideFactory.provide());
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
      }

      private Set<ViewModelProvider.Factory> defaultActivityViewModelFactorySetOfViewModelProviderFactory(
          ) {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), keySetSetOfString(), new ViewModelCBuilder(), defaultActivityViewModelFactorySetOfViewModelProviderFactory(), Collections.<ViewModelProvider.Factory>emptySet());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
        }

        private Set<ViewModelProvider.Factory> defaultFragmentViewModelFactorySetOfViewModelProviderFactory(
            ) {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.keySetSetOfString(), new ViewModelCBuilder(), ActivityCImpl.this.defaultActivityViewModelFactorySetOfViewModelProviderFactory(), defaultFragmentViewModelFactorySetOfViewModelProviderFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        @Override
        public void injectCheckInFragment(CheckInFragment checkInFragment) {
        }

        @Override
        public void injectInboxFragment(InboxFragment inboxFragment) {
        }

        @Override
        public void injectViewMoreFragment(ViewMoreFragment viewMoreFragment) {
        }

        @Override
        public void injectNewsFragment(NewsFragment newsFragment) {
        }

        @Override
        public void injectPortfolioFragment(PortfolioFragment portfolioFragment) {
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
      private volatile Provider<NewsViewModel> newsViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private NewsViewModel newsViewModel() {
        return new NewsViewModel(DaggerMainApplication_HiltComponents_SingletonC.this.newsRepository());
      }

      private Provider<NewsViewModel> newsViewModelProvider() {
        Object local = newsViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          newsViewModelProvider = (Provider<NewsViewModel>) local;
        }
        return (Provider<NewsViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>singletonMap("ui.news.NewsViewModel", (Provider) newsViewModelProvider());
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // ui.news.NewsViewModel 
            return (T) ViewModelCImpl.this.newsViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
