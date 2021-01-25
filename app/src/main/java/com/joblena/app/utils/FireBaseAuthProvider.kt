package com.joblena.app.utils

import android.app.Activity
import android.util.Log
import com.google.android.gms.tasks.TaskExecutors
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.*
import timber.log.Timber
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FireBaseAuthProvider @Inject constructor(val firebaseAuth: FirebaseAuth) {

    private lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    private lateinit var verificationId: String

    private lateinit var phoneCallbacksListener: PhoneCallbacksListener

    fun setPhoneCallbacksListener(listner: PhoneCallbacksListener) {
        this.phoneCallbacksListener = listner
    }

    init {
        firebaseAuth.setLanguageCode(Locale.getDefault().language)
    }

    private val callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks =
            object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
                    val code = phoneAuthCredential.smsCode
                    if (code != null) {
                        phoneCallbacksListener.onVerificationCodeDetected(code)
                    }
                }

                override fun onVerificationFailed(e: FirebaseException) {
                    Log.e("zzzzzzzzzzzzzzzzzz", "ddddddddddddddddddddddd")
                    when (e) {
                        is FirebaseAuthInvalidCredentialsException -> {
                            // Invalid request
                            phoneCallbacksListener.onVerificationFailed(e.message ?: " ")
                        }
                        is FirebaseTooManyRequestsException -> {
                            // The SMS quota for the project has been exceeded
                            phoneCallbacksListener.onVerificationFailed(e.message ?: " ")
                        }
                        else -> {
                            phoneCallbacksListener.onVerificationFailed(e.message ?: " ")
                        }
                    }
                    Timber.d("FireBaseAuthProvider.onVerificationFailed e() ${e.message}")
                }

                override fun onCodeSent(
                        s: String,
                        forceResendingToken: PhoneAuthProvider.ForceResendingToken
                ) {
                    super.onCodeSent(s, forceResendingToken)
                    Log.e("zzzzzzzzzzzzzzzzzz", "ssssssssssssssssssssss")
                    verificationId = s
                    resendToken = forceResendingToken
                    phoneCallbacksListener.onCodeSent(s, forceResendingToken)
                }
            }

    fun sendVerificationCode(phone: String) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phone.trim(),
                60,
                TimeUnit.SECONDS,
                TaskExecutors.MAIN_THREAD,
                callbacks
        )
    }

    // For Firebase update  reCAPTCHA
//    fun sendVerificationCode(phone: String, activity: Activity) {
//        PhoneAuthProvider.verifyPhoneNumber(
//                PhoneAuthOptions
//                        .newBuilder(FirebaseAuth.getInstance())
//                        .setActivity(activity)
//                        .setPhoneNumber(phone.trim())
//                        .setTimeout(60L, TimeUnit.SECONDS)
//                        .setCallbacks(callbacks)
//                        .build())
//    }


    fun verifyVerificationCode(code: String): PhoneAuthCredential {
        return PhoneAuthProvider.getCredential(verificationId, code)
    }

    fun resendCode(phone: String) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(phone, 60, TimeUnit.SECONDS, TaskExecutors.MAIN_THREAD, callbacks, resendToken)
    }

    // For Firebase update  reCAPTCHA
//    fun resendCode(phone: String, activity: Activity) {
//        PhoneAuthProvider.verifyPhoneNumber(
//                PhoneAuthOptions
//                        .newBuilder(FirebaseAuth.getInstance())
//                        .setActivity(activity)
//                        .setPhoneNumber(phone.trim())
//                        .setTimeout(60L, TimeUnit.SECONDS)
//                        .setCallbacks(callbacks)
//                        .setForceResendingToken(resendToken)
//                        .build())
//    }

    fun isUserVerified(): Boolean {
        return firebaseAuth.currentUser != null
    }
}

interface PhoneCallbacksListener {
    fun onVerificationCompleted()
    fun onVerificationCodeDetected(code: String)
    fun onVerificationFailed(message: String)
    fun onCodeSent(
            verificationId: String?,
            token: PhoneAuthProvider.ForceResendingToken?
    )
}