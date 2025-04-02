package com.example.softmarket.data.network

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT


interface Api {
    @GET("")
    suspend fun getData() : ApiResponse

    @POST("")
    suspend fun postData(
        @Body res: ApiResponse
    ) : Response<NetworkResponse>

    @PUT("")
    suspend fun putData() : Response<NetworkResponse>

    @DELETE("")
    suspend fun deleteData() : Response<NetworkResponse>
}