package com.example.kotlin_compose_myinfo.model.repository

import com.example.kotlin_compose_myinfo.model.PopulationMalaysia
import com.example.kotlin_compose_myinfo.model.api.RetrofitInstance

class ApiRepository {
    private val populationMalaysiaService = RetrofitInstance.getPopulationMalaysiaService

    suspend fun getPopulationMalaysia(): PopulationMalaysia {
        return populationMalaysiaService.getPopulationMalaysia()
    }
}