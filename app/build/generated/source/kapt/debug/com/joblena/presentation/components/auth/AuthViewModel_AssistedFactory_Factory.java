package com.joblena.presentation.components.auth;

import com.joblena.app.utils.FireBaseAuthProvider;
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
public final class AuthViewModel_AssistedFactory_Factory implements Factory<AuthViewModel_AssistedFactory> {
  private final Provider<AuthViewInteract> authViewInteractProvider;

  private final Provider<FireBaseAuthProvider> fireBaseAuthProvider;

  public AuthViewModel_AssistedFactory_Factory(Provider<AuthViewInteract> authViewInteractProvider,
      Provider<FireBaseAuthProvider> fireBaseAuthProvider) {
    this.authViewInteractProvider = authViewInteractProvider;
    this.fireBaseAuthProvider = fireBaseAuthProvider;
  }

  @Override
  public AuthViewModel_AssistedFactory get() {
    return newInstance(authViewInteractProvider, fireBaseAuthProvider);
  }

  public static AuthViewModel_AssistedFactory_Factory create(
      Provider<AuthViewInteract> authViewInteractProvider,
      Provider<FireBaseAuthProvider> fireBaseAuthProvider) {
    return new AuthViewModel_AssistedFactory_Factory(authViewInteractProvider, fireBaseAuthProvider);
  }

  public static AuthViewModel_AssistedFactory newInstance(
      Provider<AuthViewInteract> authViewInteract,
      Provider<FireBaseAuthProvider> fireBaseAuthProvider) {
    return new AuthViewModel_AssistedFactory(authViewInteract, fireBaseAuthProvider);
  }
}
