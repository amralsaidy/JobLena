package com.joblena.app.dih;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofit();
  }

  public static RetrofitModule_ProvideRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofit() {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvideRetrofitFactory INSTANCE = new RetrofitModule_ProvideRetrofitFactory();
  }
}
