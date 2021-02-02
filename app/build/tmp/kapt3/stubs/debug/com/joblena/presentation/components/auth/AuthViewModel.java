package com.joblena.presentation.components.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001CB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020\u0017J\u000e\u00100\u001a\u00020\'2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u00101\u001a\u000202J\u001c\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010\u00172\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u0002022\u0006\u00108\u001a\u00020\u0017H\u0016J\b\u00109\u001a\u000202H\u0016J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020\u0017H\u0016J\u0006\u0010<\u001a\u000202J\u000e\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?J\b\u0010@\u001a\u000202H\u0002J\u0016\u0010A\u001a\u0002022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?J\u000e\u0010B\u001a\u0002022\u0006\u0010/\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020+0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%\u00a8\u0006D"}, d2 = {"Lcom/joblena/presentation/components/auth/AuthViewModel;", "Lcom/joblena/presentation/base/BaseViewModel;", "Lcom/joblena/app/utils/PhoneCallbacksListener;", "authViewInteract", "Lcom/joblena/presentation/components/auth/AuthViewInteract;", "fireBaseAuthProvider", "Lcom/joblena/app/utils/FireBaseAuthProvider;", "(Lcom/joblena/presentation/components/auth/AuthViewInteract;Lcom/joblena/app/utils/FireBaseAuthProvider;)V", "getAuthViewInteract", "()Lcom/joblena/presentation/components/auth/AuthViewInteract;", "setAuthViewInteract", "(Lcom/joblena/presentation/components/auth/AuthViewInteract;)V", "getFireBaseAuthProvider", "()Lcom/joblena/app/utils/FireBaseAuthProvider;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setFirebaseAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "millisUntilFinished", "", "phone", "", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "resendCodeCountdown", "Ljava/lang/Runnable;", "resendCodeLooper", "Landroid/os/Handler;", "selectedOtpNumberLiveData", "Landroidx/lifecycle/MutableLiveData;", "getSelectedOtpNumberLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSelectedOtpNumberLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "showResendCodeText", "", "getShowResendCodeText", "setShowResendCodeText", "verifyOtpLiveData", "", "getVerifyOtpLiveData", "setVerifyOtpLiveData", "checkIfOtpIsValid", "otp", "checkIfPhoneIsValid", "clearCountdownTick", "", "onCodeSent", "verificationId", "token", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "onVerificationCodeDetected", "code", "onVerificationCompleted", "onVerificationFailed", "message", "processCountdownTick", "resendOtp", "activity", "Landroid/app/Activity;", "resetCountdownTick", "sendOtpToPhone", "verifyOtp", "Companion", "app_debug"})
public final class AuthViewModel extends com.joblena.presentation.base.BaseViewModel implements com.joblena.app.utils.PhoneCallbacksListener {
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> selectedOtpNumberLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> verifyOtpLiveData;
    private long millisUntilFinished = 30000L;
    private final android.os.Handler resendCodeLooper = null;
    private final java.lang.Runnable resendCodeCountdown = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showResendCodeText;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone = "";
    @org.jetbrains.annotations.NotNull()
    private com.joblena.presentation.components.auth.AuthViewInteract authViewInteract;
    @org.jetbrains.annotations.NotNull()
    private final com.joblena.app.utils.FireBaseAuthProvider fireBaseAuthProvider = null;
    private static final int OTP_VERIFICATION_SUCCESS = 0;
    private static final int OTP_VERIFICATION_FAILD = 1;
    private static final long RESEND_WAIT_MILLIS = 30000L;
    private static final long TICK_INTERVAL_MILLIS = 1000L;
    public static final com.joblena.presentation.components.auth.AuthViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    public final void setFirebaseAuth(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedOtpNumberLiveData() {
        return null;
    }
    
    public final void setSelectedOtpNumberLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getVerifyOtpLiveData() {
        return null;
    }
    
    public final void setVerifyOtpLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowResendCodeText() {
        return null;
    }
    
    public final void setShowResendCodeText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void sendOtpToPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void verifyOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String otp) {
    }
    
    public final void resendOtp(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final boolean checkIfPhoneIsValid(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return false;
    }
    
    public final boolean checkIfOtpIsValid(@org.jetbrains.annotations.NotNull()
    java.lang.String otp) {
        return false;
    }
    
    public final void processCountdownTick() {
    }
    
    private final void resetCountdownTick() {
    }
    
    public final void clearCountdownTick() {
    }
    
    @java.lang.Override()
    public void onVerificationCompleted() {
    }
    
    @java.lang.Override()
    public void onVerificationCodeDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    @java.lang.Override()
    public void onVerificationFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onCodeSent(@org.jetbrains.annotations.Nullable()
    java.lang.String verificationId, @org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.joblena.presentation.components.auth.AuthViewInteract getAuthViewInteract() {
        return null;
    }
    
    public final void setAuthViewInteract(@org.jetbrains.annotations.NotNull()
    com.joblena.presentation.components.auth.AuthViewInteract p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.joblena.app.utils.FireBaseAuthProvider getFireBaseAuthProvider() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.joblena.presentation.components.auth.AuthViewInteract authViewInteract, @org.jetbrains.annotations.NotNull()
    com.joblena.app.utils.FireBaseAuthProvider fireBaseAuthProvider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/joblena/presentation/components/auth/AuthViewModel$Companion;", "", "()V", "OTP_VERIFICATION_FAILD", "", "getOTP_VERIFICATION_FAILD", "()I", "OTP_VERIFICATION_SUCCESS", "getOTP_VERIFICATION_SUCCESS", "RESEND_WAIT_MILLIS", "", "TICK_INTERVAL_MILLIS", "app_debug"})
    public static final class Companion {
        
        public final int getOTP_VERIFICATION_SUCCESS() {
            return 0;
        }
        
        public final int getOTP_VERIFICATION_FAILD() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}