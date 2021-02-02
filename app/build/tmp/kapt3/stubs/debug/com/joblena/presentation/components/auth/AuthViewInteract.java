package com.joblena.presentation.components.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/joblena/presentation/components/auth/AuthViewInteract;", "", "showSnackBarMessage", "", "message", "", "startSMSListener", "activity", "Landroid/app/Activity;", "app_debug"})
public abstract interface AuthViewInteract {
    
    public abstract void showSnackBarMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void startSMSListener(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
}