package com.example.quize.network

import com.example.quize.datamodel.UsersList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "http://papp.ir/api/v1/"

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

interface MaktabApiService {
    @GET("users")
    suspend fun getUserList(): UsersList
}

object MaktabApi {
    val Service = retrofit.create(MaktabApiService::class.java)

}
