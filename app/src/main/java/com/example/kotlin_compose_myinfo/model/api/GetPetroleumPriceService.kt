package com.example.kotlin_compose_myinfo.model.api

import com.example.kotlin_compose_myinfo.model.PetroleumPrice
import retrofit2.http.GET

interface GetPetroleumPriceService {
    @GET("data-catalogue?id=fuelprice&limit=3")
    suspend fun getPetroleumPrice(): PetroleumPrice
}