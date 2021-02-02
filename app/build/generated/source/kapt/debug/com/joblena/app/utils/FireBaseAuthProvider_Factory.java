package com.joblena.app.utils;

import com.google.firebase.auth.FirebaseAuth;
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
public final class FireBaseAuthProvider_Factory implements Factory<FireBaseAuthProvider> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public FireBaseAuthProvider_Factory(Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public FireBaseAuthProvider get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static FireBaseAuthProvider_Factory create(Provider<FirebaseAuth> firebaseAuthProvider) {
    return new FireBaseAuthProvider_Factory(firebaseAuthProvider);
  }

  public static FireBaseAuthProvider newInstance(FirebaseAuth firebaseAuth) {
    return new FireBaseAuthProvider(firebaseAuth);
  }
}
