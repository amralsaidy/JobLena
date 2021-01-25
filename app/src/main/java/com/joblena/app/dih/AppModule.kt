/*
 * Created by Andrii Kovalchuk
 * Copyright (c) 2020. All rights reserved.
 * Last modified 27.03.20 16:30
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.joblena.app.dih

import com.google.firebase.auth.FirebaseAuth
import com.joblena.presentation.components.auth.AuthFragment
import com.joblena.presentation.components.auth.AuthViewInteract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * Module which provides all required dependencies about network requests (not firebase)
 */

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Provides
    @Singleton
    internal fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()


    @Provides
    @Singleton
    internal fun provideAuthViewInteract(): AuthViewInteract = AuthFragment()
//
//    @Provides
//    @Singleton
//    internal fun provideAuthCodeViewInteract(): AuthCodeViewInteract = AuthCodeFragment()

}