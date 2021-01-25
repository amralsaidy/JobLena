package com.joblena.presentation.components.intro

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.joblena.R
import com.joblena.databinding.FragmentWelcomeBinding
import com.joblena.presentation.base.BaseFragment
import com.joblena.presentation.components.auth.AuthViewModel


class WelcomeFragment: BaseFragment<FragmentWelcomeBinding, ViewModel>(R.layout.fragment_welcome) {

    override val viewModel by viewModels<AuthViewModel>()
    val languages = arrayOf("Arabic", "English")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter =  ArrayAdapter.createFromResource(requireContext(), R.array.languages, R.layout.item_list)
        (binding.textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)


        binding.agreeTvId.setOnClickListener {
//            val directions = WelcomeFragmentDirections.actionWelcomeFragmentToAuthFragment()
//            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_id).navigate(directions)

            findNavController().navigate(R.id.action_welcome_fragment_to_auth_fragment)
        }
    }


}