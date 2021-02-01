package com.joblena.presentation.components.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.joblena.R

class AuthCodeFragmentDirections private constructor() {
  companion object {
    fun actionAuthCodeFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_auth_code_fragment_to_home_fragment)
  }
}
