package com.joblena.data.api

import com.google.gson.JsonObject
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface ApiClient {

    @FormUrlEncoded
    @POST("users/api/login/")
    fun userLoginAsync(@Header("key") key: String?, @FieldMap map: MutableMap<String, String>): Deferred<Response<JsonObject>>

    @FormUrlEncoded
    @POST("users/api/token/")
    fun userLogin(@Header("key") key: String?, @FieldMap map: MutableMap<String, String>): Deferred<Response<JsonObject>>

    @FormUrlEncoded
    @GET("users/api/user_data/")
    fun userData(@Header("token") token: String?): Deferred<Response<JsonObject>>


}