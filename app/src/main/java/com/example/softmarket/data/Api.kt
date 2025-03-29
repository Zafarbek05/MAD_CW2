package com.example.softmarket.data

import retrofit2.http.GET
import retrofit2.http.Query


interface Api {
    @GET
    suspend fun getData(
        @Query("student_id") studentId: String = "00016417"
    )
}