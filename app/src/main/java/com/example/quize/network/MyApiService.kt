package com.example.quize.network

import com.example.quize.datamodel.UserItem
import retrofit2.Response
import retrofit2.http.GET


interface MyApiService {

    @GET("/users")
    fun getUsers()
}
