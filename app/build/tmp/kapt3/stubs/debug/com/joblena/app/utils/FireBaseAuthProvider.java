package com.joblena.app.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/joblena/app/utils/FireBaseAuthProvider;", "", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "callbacks", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "phoneCallbacksListener", "Lcom/joblena/app/utils/PhoneCallbacksListener;", "resendToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "verificationId", "", "isUserVerified", "", "resendCode", "", "phone", "sendVerificationCode", "setPhoneCallbacksListener", "listner", "verifyVerificationCode", "Lcom/google/firebase/auth/PhoneAuthCredential;", "code", "app_debug"})
@javax.inject.Singleton()
public final class FireBaseAuthProvider {
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken resendToken;
    private java.lang.String verificationId;
    private com.joblena.app.utils.PhoneCallbacksListener phoneCallbacksListener;
    private final com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    
    public final void setPhoneCallbacksListener(@org.jetbrains.annotations.NotNull()
    com.joblena.app.utils.PhoneCallbacksListener listner) {
    }
    
    public final void sendVerificationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.PhoneAuthCredential verifyVerificationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public final void resendCode(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    public final boolean isUserVerified() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    @javax.inject.Inject()
    public FireBaseAuthProvider(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
}