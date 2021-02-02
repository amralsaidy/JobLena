package com.joblena.app.dih;

import com.joblena.presentation.components.auth.AuthViewInteract;
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
public final class AppModule_ProvideAuthViewInteract$app_debugFactory implements Factory<AuthViewInteract> {
  @Override
  public AuthViewInteract get() {
    return provideAuthViewInteract$app_debug();
  }

  public static AppModule_ProvideAuthViewInteract$app_debugFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthViewInteract provideAuthViewInteract$app_debug() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideAuthViewInteract$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAuthViewInteract$app_debugFactory INSTANCE = new AppModule_ProvideAuthViewInteract$app_debugFactory();
  }
}
