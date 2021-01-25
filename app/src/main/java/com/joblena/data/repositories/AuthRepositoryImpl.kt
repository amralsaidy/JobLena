package com.joblena.data.repositories

import com.google.gson.JsonObject
import com.joblena.app.common.Constants.API_KEY
import com.joblena.data.api.ApiClient
import com.joblena.domain.repositories.AuthRepository
import com.joblena.domain.response.ApiResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepositoryImpl @Inject constructor(private val apiClient: ApiClient): AuthRepository {

    override suspend fun userLogin(map: MutableMap<String, String>) : ApiResponse<JsonObject?> {
        val response = apiClient.userLogin(API_KEY, map).await()

        return if (response.isSuccessful)
            ApiResponse.Success(response.body())
        else
            ApiResponse.Failure(response.message(), response.code())
    }

    override suspend fun userData(token:String) : ApiResponse<JsonObject?> {
        val response = apiClient.userData(token).await()

        return if (response.isSuccessful)
            ApiResponse.Success(response.body())
        else
            ApiResponse.Failure(response.message(), response.code())
    }


}