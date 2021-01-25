package com.joblena.presentation.components.auth

import android.app.Activity
import com.google.firebase.auth.PhoneAuthCredential
import com.joblena.presentation.base.ViewInteract

interface AuthViewInteract{

    fun showSnackBarMessage(message: String)

    fun startSMSListener(activity: Activity)
}