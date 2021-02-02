package com.joblena.presentation.components.auth;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.joblena.app.utils.FireBaseAuthProvider;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AuthViewModel_AssistedFactory implements ViewModelAssistedFactory<AuthViewModel> {
  private final Provider<AuthViewInteract> authViewInteract;

  private final Provider<FireBaseAuthProvider> fireBaseAuthProvider;

  @Inject
  AuthViewModel_AssistedFactory(Provider<AuthViewInteract> authViewInteract,
      Provider<FireBaseAuthProvider> fireBaseAuthProvider) {
    this.authViewInteract = authViewInteract;
    this.fireBaseAuthProvider = fireBaseAuthProvider;
  }

  @Override
  @NonNull
  public AuthViewModel create(SavedStateHandle arg0) {
    return new AuthViewModel(authViewInteract.get(), fireBaseAuthProvider.get());
  }
}
