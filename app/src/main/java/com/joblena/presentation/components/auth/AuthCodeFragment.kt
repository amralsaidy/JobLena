package com.joblena.presentation.components.auth

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.joblena.R
import com.joblena.databinding.FragmentAuthCodeBinding
import com.joblena.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthCodeFragment : BaseFragment<FragmentAuthCodeBinding, AuthViewModel>(R.layout.fragment_auth_code) {

    var firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    override val viewModel by viewModels<AuthViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.processCountdownTick()

        val text: String = resources.getString(R.string.code_auth_subtitle, viewModel.phone)
        binding.textViewSubtitleCodeAuth.text = text


        val spannable = SpannableStringBuilder("Didn't received OTP? Resend")
        spannable.setSpan(
                ForegroundColorSpan(resources.getColor(R.color.primary_700)),
                spannable.indexOf("Resend"), spannable.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.textViewTicker.text = spannable

        viewModel.selectedOtpNumberLiveData.observe(
                requireActivity(),
                Observer<String?> { value ->
                    binding.otpEditText.setText(value ?: "")

                    if (viewModel.checkIfOtpIsValid(binding.otpEditText.text.toString())) {
                        viewModel.verifyOtp(binding.otpEditText.text.toString())
                    } else {
                        showSnackBar("Invalid Otp: Please enter correct OTP")
                    }
                }
        )

        viewModel.verifyOtpLiveData.observe(requireActivity(), Observer {
            if (it == 0) {
//                binding.verifyProgress
                findNavController().navigate(R.id.action_auth_code_fragment_to_home_fragment)
            } else if (it == 1) {
                showSnackBar("Verification Code Failed")
            }
        })


//        binding.buttonVerifyOtp.setOnClickListener {
//            if (viewModel.checkIfOtpIsValid(binding.otpEditText.text.toString())) {
//                viewModel.verifyOtp(binding.otpEditText.text.toString())
//            } else {
//                showSnackBar("Invalid Code: Please enter correct code")
//            }
//        }

        viewModel.showResendCodeText.observe(
                requireActivity(),
                Observer<Boolean?> { value ->
                    when (value) {
                        true -> binding.textViewTicker.visibility = View.VISIBLE
                        false -> binding.textViewTicker.visibility = View.GONE
                        else -> binding.textViewTicker.visibility = View.GONE
                    }
                }
        )

        binding.textViewTicker.setOnClickListener {
            viewModel.resendOtp(requireActivity())
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.clearCountdownTick()
    }

//    override fun signInWithPhoneAuthCredential(credential: PhoneAuthCredential) {
//        firebaseAuth.signInWithCredential(credential)
//                .addOnCompleteListener {
//                    if (it.isSuccessful) {
//                        goToTargetFragment()
//                    } else {
//                        // Show Error
//                        if (it.exception is FirebaseAuthInvalidCredentialsException) {
//                            // The verification code entered was invalid
//                            showSnackBar(it.exception?.message ?: "Verification Failed")
//                        } else {
//                            showSnackBar("Verification Failed")
//                        }
//                    }
//                }
//    }

//    override fun goToTargetFragment() {
////        val directions = AuthOtpFragmentDirections.actionAuthOtpFragmentToHomeFragment()
////        Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_id).navigate(directions)
//        findNavController().navigate(R.id.action_global_home_fragment_id)
//    }
}