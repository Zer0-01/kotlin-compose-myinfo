package com.example.kotlin_compose_myinfo.model.api

import com.example.kotlin_compose_myinfo.model.PopulationMalaysia
import retrofit2.http.GET

interface GetPopulationMalaysiaService {
    @GET ("data-catalogue?id=population_malaysia&limit=10")
    suspend fun getPopulationMalaysia(): PopulationMalaysia
}