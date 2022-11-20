// Generated by Dagger (https://dagger.dev).
package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import data.remote.api.ApiAppService;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideAuthServiceFactory implements Factory<ApiAppService> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  public NetworkModule_ProvideAuthServiceFactory(Provider<OkHttpClient> clientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    this.clientProvider = clientProvider;
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
  }

  @Override
  public ApiAppService get() {
    return provideAuthService(clientProvider.get(), gsonConverterFactoryProvider.get());
  }

  public static NetworkModule_ProvideAuthServiceFactory create(
      Provider<OkHttpClient> clientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    return new NetworkModule_ProvideAuthServiceFactory(clientProvider, gsonConverterFactoryProvider);
  }

  public static ApiAppService provideAuthService(OkHttpClient client,
      GsonConverterFactory gsonConverterFactory) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAuthService(client, gsonConverterFactory));
  }
}