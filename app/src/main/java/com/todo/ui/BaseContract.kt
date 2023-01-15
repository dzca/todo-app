package com.todo.ui

import androidx.annotation.UiThread

interface BaseContract {
    @UiThread
    interface View

    interface Presenter<V : View> {

        fun attach(view: V)

        fun detach()
    }
}