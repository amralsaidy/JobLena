package com.joblena.presentation.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import kotlin.concurrent.fixedRateTimer

abstract class BaseFragment<DB : ViewDataBinding, VM : ViewModel>(var layout: Int) : Fragment(layout) {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory


    protected lateinit var binding: DB

    abstract val viewModel: VM
//    lateinit var viewModel: VM

//    @LayoutRes
//    protected abstract fun layoutId(): Int

//    abstract fun getViewModelClass(): Class<VM>

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
                inflater,
                layout,
                container,
                false
        )
//
////        viewModel = activity?.run {
////            ViewModelProviders.of(this, viewModelFactory).get(getViewModelClass())
////        } ?: throw Exception("Invalid Activity")
//
        return binding.root
    }

    fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    private fun Context.hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun showSnackBar(message: String) {
//        Snackbar.make(binding.root, message, Snackbar.LENGTH_LONG).show()
    }
}