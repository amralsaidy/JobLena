package com.joblena.presentation.components.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.joblena.R
import com.joblena.databinding.FragmentHomeBinding
import com.joblena.presentation.base.BaseFragment
import com.joblena.presentation.components.auth.AuthViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: BaseFragment<FragmentHomeBinding, ViewModel>(R.layout.fragment_home) {


    override val viewModel by viewModels<AuthViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        business_btn_id.setOnClickListener {
            findNavController().navigate(R.id.action_home_fragment_id_to_signup_business_fragment_id)
        }

        personal_btn_id.setOnClickListener {
            findNavController().navigate(R.id.action_home_fragment_id_to_signup_personal_fragment_id)
        }

        skill_picker.setOnClickListener {
            findNavController().navigate(R.id.action_home_fragment_id_to_pick_skill_Fragment_id)
        }


//        logout_btn_id.setOnClickListener {
//            FirebaseAuth.getInstance().signOut()
//        }
    }
}