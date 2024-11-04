package com.example.kotlin_compose_myinfo.model.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://api.data.gov.my/"
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val getPopulationMalaysiaService: GetPopulationMalaysiaService by lazy {
        retrofit.create(GetPopulationMalaysiaService::class.java)
    }
}