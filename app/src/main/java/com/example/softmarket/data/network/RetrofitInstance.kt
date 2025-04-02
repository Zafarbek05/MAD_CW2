package com.example.softmarket.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: Api by lazy {
        Retrofit.Builder()
            .baseUrl("https://wiutmadcw.uz/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }
}