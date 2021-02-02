package com.joblena.app.dih;

import java.lang.System;

/**
 * Module which provides all required dependencies about network requests (not firebase)
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/joblena/app/dih/AppModule;", "", "()V", "provideAuthViewInteract", "Lcom/joblena/presentation/components/auth/AuthViewInteract;", "provideAuthViewInteract$app_debug", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirebaseAuth$app_debug", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.joblena.app.dih.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.joblena.presentation.components.auth.AuthViewInteract provideAuthViewInteract$app_debug() {
        return null;
    }
    
    private AppModule() {
        super();
    }
}