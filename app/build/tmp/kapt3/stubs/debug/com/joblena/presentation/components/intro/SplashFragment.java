package com.joblena.presentation.components.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/joblena/presentation/components/intro/SplashFragment;", "Lcom/joblena/presentation/base/BaseFragment;", "Lcom/joblena/databinding/FragmentSplashBinding;", "Landroidx/lifecycle/ViewModel;", "()V", "viewModel", "Lcom/joblena/presentation/components/auth/AuthViewModel;", "getViewModel", "()Lcom/joblena/presentation/components/auth/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initDelay", "", "onResume", "AnimationHandler", "SplashHandler", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashFragment extends com.joblena.presentation.base.BaseFragment<com.joblena.databinding.FragmentSplashBinding, androidx.lifecycle.ViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.joblena.presentation.components.auth.AuthViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void initDelay() {
    }
    
    public SplashFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/joblena/presentation/components/intro/SplashFragment$AnimationHandler;", "Ljava/lang/Runnable;", "(Lcom/joblena/presentation/components/intro/SplashFragment;)V", "run", "", "app_debug"})
    public final class AnimationHandler implements java.lang.Runnable {
        
        @java.lang.Override()
        public void run() {
        }
        
        public AnimationHandler() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/joblena/presentation/components/intro/SplashFragment$SplashHandler;", "Ljava/lang/Runnable;", "(Lcom/joblena/presentation/components/intro/SplashFragment;)V", "run", "", "app_debug"})
    public final class SplashHandler implements java.lang.Runnable {
        
        @java.lang.Override()
        public void run() {
        }
        
        public SplashHandler() {
            super();
        }
    }
}