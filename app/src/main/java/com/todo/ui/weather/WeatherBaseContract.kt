package com.todo.ui.weather

import androidx.annotation.UiThread

interface WeatherBaseContract {

    @UiThread
    interface View<T>{
        fun setPresenter(presenter : T)
    }

    interface Presenter{
        fun onDestroy()
    }
}