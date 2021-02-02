package com.joblena.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J6\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bH\'J6\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/joblena/data/api/ApiClient;", "", "userData", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/google/gson/JsonObject;", "token", "", "userLogin", "key", "map", "", "userLoginAsync", "app_debug"})
public abstract interface ApiClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users/api/login/")
    @retrofit2.http.FormUrlEncoded()
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> userLoginAsync(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FieldMap()
    java.util.Map<java.lang.String, java.lang.String> map);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users/api/token/")
    @retrofit2.http.FormUrlEncoded()
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> userLogin(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FieldMap()
    java.util.Map<java.lang.String, java.lang.String> map);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/api/user_data/")
    @retrofit2.http.FormUrlEncoded()
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.google.gson.JsonObject>> userData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "token")
    java.lang.String token);
}