package com.joblena.presentation.components.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.joblena.R

class AuthFragmentDirections private constructor() {
  companion object {
    fun actionAuthFragmentToAuthCodeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_auth_fragment_to_auth_code_fragment)
  }
}
