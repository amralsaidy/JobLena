package com.joblena.app.dih;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFirebaseAuth$app_debugFactory implements Factory<FirebaseAuth> {
  @Override
  public FirebaseAuth get() {
    return provideFirebaseAuth$app_debug();
  }

  public static AppModule_ProvideFirebaseAuth$app_debugFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseAuth provideFirebaseAuth$app_debug() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideFirebaseAuth$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideFirebaseAuth$app_debugFactory INSTANCE = new AppModule_ProvideFirebaseAuth$app_debugFactory();
  }
}
