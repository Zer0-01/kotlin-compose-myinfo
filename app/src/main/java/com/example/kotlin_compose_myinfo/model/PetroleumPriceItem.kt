package com.example.kotlin_compose_myinfo.model

data class PetroleumPriceItem(
    val date: String,
    val diesel: Double,
    val diesel_eastmsia: Double,
    val ron95: Double,
    val ron97: Double,
    val series_type: String
)