package com.joblena.presentation.components.intro

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.joblena.R

class WelcomeFragmentDirections private constructor() {
  companion object {
    fun actionWelcomeFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcome_fragment_to_auth_fragment)
  }
}
