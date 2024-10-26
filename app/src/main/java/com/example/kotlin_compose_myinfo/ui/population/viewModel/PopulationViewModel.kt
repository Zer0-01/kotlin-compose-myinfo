package com.example.kotlin_compose_myinfo.ui.population.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_compose_myinfo.model.PopulationMalaysia
import com.example.kotlin_compose_myinfo.model.PopulationMalaysiaItem
import com.example.kotlin_compose_myinfo.model.repository.ApiRepository
import kotlinx.coroutines.launch

class PopulationViewModel : ViewModel() {
    private val repository = ApiRepository()

    private val _populationMalaysia = MutableLiveData<PopulationMalaysia>()
    val populationMalaysia: LiveData<PopulationMalaysia> = _populationMalaysia

    fun fetchPopulationMalaysia() {
        viewModelScope.launch {
            try {
                val populationMalaysia = repository.getPopulationMalaysia()
                _populationMalaysia.value = populationMalaysia
            } catch (e: Exception) {
                Log.d("Repo", "fetchPopulationMalaysia exception ${e.message}")
            }

        }
    }
}