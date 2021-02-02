package com.joblena.presentation.components.auth;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = AuthViewModel.class
)
public interface AuthViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.joblena.presentation.components.auth.AuthViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(AuthViewModel_AssistedFactory factory);
}
