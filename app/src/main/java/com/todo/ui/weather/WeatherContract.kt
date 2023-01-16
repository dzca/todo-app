package com.todo.ui.weather

interface WeatherContract {
    interface View: WeatherBaseContract.View<WeatherContract.Presenter>{
        fun displayWeather(weather: String)
    }

    interface Presenter: WeatherBaseContract.Presenter{
        // load default weather from rest api
        fun onViewCreated()

        // load rain weather from rest api
        fun onButtonClicked()
    }
}