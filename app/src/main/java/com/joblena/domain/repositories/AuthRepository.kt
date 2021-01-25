package com.joblena.domain.repositories

import com.google.firebase.auth.PhoneAuthCredential
import com.google.gson.JsonObject
import com.joblena.domain.response.ApiResponse

interface AuthRepository {
    suspend fun userLogin(map: MutableMap<String, String>) : ApiResponse<JsonObject?>
    suspend fun userData(token:String) : ApiResponse<JsonObject?>
}