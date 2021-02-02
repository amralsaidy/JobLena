package com.joblena.data.repositories;

import com.joblena.data.api.ApiClient;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthRepositoryImpl_Factory implements Factory<AuthRepositoryImpl> {
  private final Provider<ApiClient> apiClientProvider;

  public AuthRepositoryImpl_Factory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public AuthRepositoryImpl get() {
    return newInstance(apiClientProvider.get());
  }

  public static AuthRepositoryImpl_Factory create(Provider<ApiClient> apiClientProvider) {
    return new AuthRepositoryImpl_Factory(apiClientProvider);
  }

  public static AuthRepositoryImpl newInstance(ApiClient apiClient) {
    return new AuthRepositoryImpl(apiClient);
  }
}
