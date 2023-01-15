package com.todo

import android.app.Application
import com.todo.di.AppComponent
import timber.log.Timber

class TodoApplication: Application() {

//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.factory().create(applicationContext)
//    }

    // Timber.d("[MainActivity] onCreate()")
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}