package com.joblena.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.joblena.app.dih.AppModule;
import com.joblena.app.dih.AppModule_ProvideAuthViewInteract$app_debugFactory;
import com.joblena.app.dih.AppModule_ProvideFirebaseAuth$app_debugFactory;
import com.joblena.app.dih.RetrofitModule;
import com.joblena.app.utils.FireBaseAuthProvider;
import com.joblena.presentation.components.HostActivity;
import com.joblena.presentation.components.auth.AuthCodeFragment;
import com.joblena.presentation.components.auth.AuthFragment;
import com.joblena.presentation.components.auth.AuthViewInteract;
import com.joblena.presentation.components.auth.AuthViewModel_AssistedFactory;
import com.joblena.presentation.components.auth.AuthViewModel_AssistedFactory_Factory;
import com.joblena.presentation.components.intro.SplashFragment;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object authViewInteract = new MemoizedSentinel();

  private volatile Provider<AuthViewInteract> provideAuthViewInteract$app_debugProvider;

  private volatile Object firebaseAuth = new MemoizedSentinel();

  private volatile Object fireBaseAuthProvider = new MemoizedSentinel();

  private volatile Provider<FireBaseAuthProvider> fireBaseAuthProvider2;

  private DaggerApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private AuthViewInteract getAuthViewInteract() {
    Object local = authViewInteract;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = authViewInteract;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideAuthViewInteract$app_debugFactory.provideAuthViewInteract$app_debug();
          authViewInteract = DoubleCheck.reentrantCheck(authViewInteract, local);
        }
      }
    }
    return (AuthViewInteract) local;
  }

  private Provider<AuthViewInteract> getAuthViewInteractProvider() {
    Object local = provideAuthViewInteract$app_debugProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideAuthViewInteract$app_debugProvider = (Provider<AuthViewInteract>) local;
    }
    return (Provider<AuthViewInteract>) local;
  }

  private FirebaseAuth getFirebaseAuth() {
    Object local = firebaseAuth;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = firebaseAuth;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideFirebaseAuth$app_debugFactory.provideFirebaseAuth$app_debug();
          firebaseAuth = DoubleCheck.reentrantCheck(firebaseAuth, local);
        }
      }
    }
    return (FirebaseAuth) local;
  }

  private FireBaseAuthProvider getFireBaseAuthProvider() {
    Object local = fireBaseAuthProvider;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = fireBaseAuthProvider;
        if (local instanceof MemoizedSentinel) {
          local = new FireBaseAuthProvider(getFirebaseAuth());
          fireBaseAuthProvider = DoubleCheck.reentrantCheck(fireBaseAuthProvider, local);
        }
      }
    }
    return (FireBaseAuthProvider) local;
  }

  private Provider<FireBaseAuthProvider> getFireBaseAuthProviderProvider() {
    Object local = fireBaseAuthProvider2;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      fireBaseAuthProvider2 = (Provider<FireBaseAuthProvider>) local;
    }
    return (Provider<FireBaseAuthProvider>) local;
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder retrofitModule(RetrofitModule retrofitModule) {
      Preconditions.checkNotNull(retrofitModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public App_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends App_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<AuthViewModel_AssistedFactory> authViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private AuthViewModel_AssistedFactory getAuthViewModel_AssistedFactory() {
        return AuthViewModel_AssistedFactory_Factory.newInstance(DaggerApp_HiltComponents_SingletonC.this.getAuthViewInteractProvider(), DaggerApp_HiltComponents_SingletonC.this.getFireBaseAuthProviderProvider());
      }

      private Provider<AuthViewModel_AssistedFactory> getAuthViewModel_AssistedFactoryProvider() {
        Object local = authViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          authViewModel_AssistedFactoryProvider = (Provider<AuthViewModel_AssistedFactory>) local;
        }
        return (Provider<AuthViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.joblena.presentation.components.auth.AuthViewModel", (Provider) getAuthViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectHostActivity(HostActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public App_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends App_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectAuthCodeFragment(AuthCodeFragment arg0) {
        }

        @Override
        public void injectAuthFragment(AuthFragment arg0) {
        }

        @Override
        public void injectSplashFragment(SplashFragment arg0) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public App_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public App_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends App_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.joblena.presentation.components.auth.AuthViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getAuthViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.joblena.presentation.components.auth.AuthViewInteract 
        return (T) DaggerApp_HiltComponents_SingletonC.this.getAuthViewInteract();

        case 1: // com.joblena.app.utils.FireBaseAuthProvider 
        return (T) DaggerApp_HiltComponents_SingletonC.this.getFireBaseAuthProvider();

        default: throw new AssertionError(id);
      }
    }
  }
}
