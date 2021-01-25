package com.joblena.presentation.components.auth

import android.app.Activity
import android.content.*
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.common.api.Status
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.PhoneAuthCredential
import com.joblena.R
import com.joblena.databinding.FragmentAuthBinding
import com.joblena.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class AuthFragment : BaseFragment<FragmentAuthBinding, AuthViewModel>(R.layout.fragment_auth), AuthViewInteract {

    companion object {
        private const val SMS_CONSENT_REQUEST = 2
    }

    override val viewModel: AuthViewModel by viewModels()

    private val smsVerificationReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (SmsRetriever.SMS_RETRIEVED_ACTION == intent.action) {
                val extras = intent.extras
                val smsRetrieverStatus = extras?.get(SmsRetriever.EXTRA_STATUS) as Status
                when (smsRetrieverStatus.statusCode) {
                    CommonStatusCodes.SUCCESS -> {
                        val consentIntent = extras.getParcelable<Intent>(SmsRetriever.EXTRA_CONSENT_INTENT)
                        try {
                            activity?.startActivityForResult(consentIntent, SMS_CONSENT_REQUEST)
                        } catch (e: ActivityNotFoundException) {
                            showSnackBar(e.message ?: "Something went wrong")
                        }
                    }
                    CommonStatusCodes.TIMEOUT -> {
                        // Time out occurred, handle the error.
                    }
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
        requireActivity().registerReceiver(smsVerificationReceiver, intentFilter)

        binding.buttonVerifyPhone.setOnClickListener {
            activity?.hideKeyboard()
            if (viewModel.checkIfPhoneIsValid(binding.textInputEditTextPhone.text.toString())) {
                val number = binding.autoCompleteTextViewCode.text.toString() + binding.textInputEditTextPhone.text.toString()
                viewModel.sendOtpToPhone(number, requireActivity())
//                val directions = AuthFragmentDirections.actionAuthFragmentToAuthOtpFragment()
//                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_id).navigate(directions)
                findNavController().navigate(R.id.action_auth_fragment_to_auth_code_fragment)

            } else {
                binding.textInputLayoutPhone.error = "Invalid Phone"
            }
        }
    }

    override fun showSnackBarMessage(message: String) {
        showSnackBar(message)
    }

    override fun startSMSListener(activity: Activity) {
        val smsRetrieverClient = SmsRetriever.getClient(activity)
        val task = smsRetrieverClient.startSmsUserConsent(null)
        task.addOnSuccessListener {
            Toast.makeText(activity, "SMS Retriever starts", Toast.LENGTH_LONG).show()
        }
        task.addOnFailureListener {
            Toast.makeText(activity, "Error", Toast.LENGTH_LONG).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null) {
            val message = data.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
            val oneTimeCode = message?.substring(0, 6)
            Timber.d("AuthActivity.onActivityResult message $oneTimeCode")
            viewModel.selectedOtpNumberLiveData.value = oneTimeCode?.trim()
        }
    }


    override fun onDestroy() {
        requireActivity().unregisterReceiver(smsVerificationReceiver)
        super.onDestroy()
    }
}