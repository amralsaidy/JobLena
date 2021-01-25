package com.joblena.presentation.components.intro

import android.os.Handler
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.joblena.R
import com.joblena.databinding.FragmentSplashBinding
import com.joblena.presentation.base.BaseFragment
import com.joblena.presentation.components.auth.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding, ViewModel>(R.layout.fragment_splash) {


    override val viewModel by viewModels<AuthViewModel>()
    override fun onResume() {
        super.onResume()
        initDelay()
    }


    private fun initDelay() {
        Handler().postDelayed(AnimationHandler(), 800)
    }

    inner class AnimationHandler : Runnable {
        override fun run() {
            Handler().postDelayed(SplashHandler(), 1800)
        }
    }

    inner class SplashHandler : Runnable {
        override fun run() {
            if(Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_id).currentDestination?.id == R.id.splash_Fragment_id) {
//                val directions = SplashFragmentDirections.actionSplashFragmentToWelcomeFragment()
//                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_id).navigate(directions)

                findNavController().navigate(R.id.action_splash_fragment_to_welcome_fragment)
            }

        }
    }

}