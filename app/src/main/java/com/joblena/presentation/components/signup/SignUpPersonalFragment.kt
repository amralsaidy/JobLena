package com.joblena.presentation.components.signup

import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.joblena.R
import com.joblena.databinding.FragmentSignupPersonalBinding
import com.joblena.presentation.base.BaseFragment
import com.joblena.presentation.base.BaseViewModel
import com.joblena.presentation.components.auth.AuthViewModel

class SignUpPersonalFragment: BaseFragment<FragmentSignupPersonalBinding, ViewModel>(R.layout.fragment_signup_personal) {
//    override fun layoutId(): Int {
//        return R.layout.fragment_signup_personal
//    }

    override val viewModel by viewModels<AuthViewModel>()
//    override fun getViewModelClass(): Class<BaseViewModel> {
//        TODO("Not yet implemented")
//    }
}