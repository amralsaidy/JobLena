package com.joblena.app

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp

//import com.leestart.app.di.AppComponent
//import com.leestart.app.di.DaggerAppComponent
//import com.leestart.app.koin.modules.sharedPrefModule
//import org.koin.android.ext.koin.androidContext
//import org.koin.android.ext.koin.androidLogger
//import org.koin.core.context.startKoin

//lateinit var injector: AppComponent

@HiltAndroidApp
class App: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}