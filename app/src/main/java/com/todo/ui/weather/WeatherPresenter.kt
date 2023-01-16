package com.todo.ui.weather

import com.todo.domain.repository.WeatherRepository

class WeatherPresenter(
    view: WeatherContract.View,
    val weatherRepository: WeatherRepository
): WeatherContract.Presenter {

    private var view: WeatherContract.View? = view

    override fun onViewCreated() {
        val weather = weatherRepository.loadWeather("sunny")
        view?.displayWeather(weather)
    }

    override fun onButtonClicked() {
        val weather = weatherRepository.loadWeather("raining")
        view?.displayWeather(weather)
    }

    override fun onDestroy() {
        this.view = null
    }
}