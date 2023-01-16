package com.todo.domain.repository

interface WeatherRepository {
    fun loadWeather(code: String): String
}