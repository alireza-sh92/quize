package com.example.quize.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager{

    private const val baseUrl:String = "http://papp.ir/api/v1"

    private fun getInstance():Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val service: MyApiService = getInstance().create(MyApiService::class.java)
}