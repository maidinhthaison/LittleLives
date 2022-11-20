// Generated by Dagger (https://dagger.dev).
package di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalModule_ProvideDataStoreFactory implements Factory<DataStore<Preferences>> {
  private final Provider<Context> appContextProvider;

  public LocalModule_ProvideDataStoreFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public DataStore<Preferences> get() {
    return provideDataStore(appContextProvider.get());
  }

  public static LocalModule_ProvideDataStoreFactory create(Provider<Context> appContextProvider) {
    return new LocalModule_ProvideDataStoreFactory(appContextProvider);
  }

  public static DataStore<Preferences> provideDataStore(Context appContext) {
    return Preconditions.checkNotNullFromProvides(LocalModule.INSTANCE.provideDataStore(appContext));
  }
}