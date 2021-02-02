package com.joblena.app.dih;

import com.joblena.data.api.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideServiceApiFactory implements Factory<ApiClient> {
  private final Provider<Retrofit> retrofitProvider;

  public RetrofitModule_ProvideServiceApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiClient get() {
    return provideServiceApi(retrofitProvider.get());
  }

  public static RetrofitModule_ProvideServiceApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new RetrofitModule_ProvideServiceApiFactory(retrofitProvider);
  }

  public static ApiClient provideServiceApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.provideServiceApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
