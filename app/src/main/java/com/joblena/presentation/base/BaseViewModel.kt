package com.joblena.presentation.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
//    var viewInteract: VI? = null
//        set
    override fun onCleared() {
        super.onCleared()
    }
}