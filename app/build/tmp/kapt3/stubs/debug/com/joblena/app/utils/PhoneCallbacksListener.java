package com.joblena.app.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lcom/joblena/app/utils/PhoneCallbacksListener;", "", "onCodeSent", "", "verificationId", "", "token", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "onVerificationCodeDetected", "code", "onVerificationCompleted", "onVerificationFailed", "message", "app_debug"})
public abstract interface PhoneCallbacksListener {
    
    public abstract void onVerificationCompleted();
    
    public abstract void onVerificationCodeDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    public abstract void onVerificationFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void onCodeSent(@org.jetbrains.annotations.Nullable()
    java.lang.String verificationId, @org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken token);
}