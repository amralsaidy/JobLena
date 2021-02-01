package com.joblena.presentation.components.intro

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.joblena.R

class SplashFragmentDirections private constructor() {
  companion object {
    fun actionSplashFragmentToWelcomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splash_fragment_to_welcome_fragment)
  }
}
