package com.joblena.presentation.components.auth

import android.app.Activity
import android.os.Handler
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.PhoneAuthProvider
import com.joblena.app.utils.FireBaseAuthProvider
import com.joblena.app.utils.PhoneCallbacksListener
import com.joblena.presentation.base.BaseViewModel
import timber.log.Timber

class AuthViewModel @ViewModelInject constructor(var authViewInteract: AuthViewInteract, val fireBaseAuthProvider: FireBaseAuthProvider)
    : BaseViewModel(), PhoneCallbacksListener {

    companion object {
//        val PHONE_VERIFICATION_PAGE = 0
//        val OTP_VERIFICATION_PAGE = 1
        val OTP_VERIFICATION_SUCCESS = 0
        val OTP_VERIFICATION_FAILD = 1
        private const val RESEND_WAIT_MILLIS: Long = 30000
        private const val TICK_INTERVAL_MILLIS: Long = 1000

    }

    init {
        fireBaseAuthProvider.setPhoneCallbacksListener(this)
        if (fireBaseAuthProvider.isUserVerified()) {
//            authOtpViewInteract.goToTargetFragment()
        }
    }
    var firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
//    var selectedPhoneNumberLiveData = MutableLiveData<String>()
    var selectedOtpNumberLiveData = MutableLiveData<String>()
    var verifyOtpLiveData = MutableLiveData<Int>()

//    var pagePositionLiveData = MutableLiveData<Int>()

    private var millisUntilFinished = RESEND_WAIT_MILLIS
    private val resendCodeLooper: Handler = Handler()
    private val resendCodeCountdown = Runnable { processCountdownTick() }
    var showResendCodeText = MutableLiveData<Boolean>()

    var phone: String = ""

    fun sendOtpToPhone(phone: String, activity: Activity) {
        this.phone = phone
        authViewInteract.startSMSListener(activity)
        fireBaseAuthProvider.sendVerificationCode(phone)

//        fireBaseAuthProvider.sendVerificationCode(phone, activity)  // For Firebase update  reCAPTCHA
    }

    fun verifyOtp(otp: String) {
//        authOtpViewInteract.signInWithPhoneAuthCredential(fireBaseAuthProvider.verifyVerificationCode(otp))

        firebaseAuth.signInWithCredential(fireBaseAuthProvider.verifyVerificationCode(otp))
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        verifyOtpLiveData.value = OTP_VERIFICATION_SUCCESS
                    } else {
                        verifyOtpLiveData.value = OTP_VERIFICATION_FAILD
                        // Show Error
//                        if (it.exception is FirebaseAuthInvalidCredentialsException) {
//                            // The verification code entered was invalid
//                            showSnackBar(it.exception?.message ?: "Verification Failed")
//                        } else {
//                            showSnackBar("Verification Failed")
//                        }
                    }
                }
    }

    fun resendOtp(activity: Activity) {
        authViewInteract.startSMSListener(activity)
        fireBaseAuthProvider.resendCode(phone)
//        fireBaseAuthProvider.resendCode(phone, activity)    // For Firebase update  reCAPTCHA
        resetCountdownTick()
    }

    fun checkIfPhoneIsValid(phone: String): Boolean {
        return phone.let {
            !it.isBlank() && (it.length > 10)
        }
    }

    fun checkIfOtpIsValid(otp: String): Boolean {
        return otp.let {
            !it.isBlank() && (it.length == 6)
        }
    }

    fun processCountdownTick() {
        millisUntilFinished -= TICK_INTERVAL_MILLIS
        when {
            millisUntilFinished <= 0 -> {
                showResendCodeText.value = true
            }
            else -> {
                showResendCodeText.value = false
                resendCodeLooper.postDelayed(resendCodeCountdown, TICK_INTERVAL_MILLIS)
            }
        }
    }

    private fun resetCountdownTick() {
        showResendCodeText.value = false
        millisUntilFinished = RESEND_WAIT_MILLIS
        resendCodeLooper.postDelayed(resendCodeCountdown, TICK_INTERVAL_MILLIS)
    }

    fun clearCountdownTick() {
        resendCodeLooper.removeCallbacks(resendCodeCountdown)
    }

    override fun onVerificationCompleted() {
        authViewInteract.showSnackBarMessage("Verification Completed")
//        authOtpViewInteract.goToTargetFragment()
    }

    override fun onVerificationCodeDetected(code: String) {
        Timber.d("AuthActivityViewModel onReceive: success $code")
        selectedOtpNumberLiveData.value = code
    }

    override fun onVerificationFailed(message: String) {
        Timber.d(message)
        authViewInteract.showSnackBarMessage(message)
    }

    override fun onCodeSent(
            verificationId: String?,
            token: PhoneAuthProvider.ForceResendingToken?
    ) {
        authViewInteract.showSnackBarMessage("OTP has sent")
//        pagePositionLiveData.value = OTP_VERIFICATION_PAGE
    }
}