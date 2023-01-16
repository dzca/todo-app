package com.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.todo.ui.profile.ProfileContract
import com.todo.ui.profile.ProfilePresenter

class MainActivity : AppCompatActivity(), ProfileContract.View {
    lateinit var presenter: ProfileContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.presenter = ProfilePresenter()
        presenter.attach(this)
        //Inject the presenter using Dependecy injection
        presenter.fetchProfileName()
    }

    override fun onProfileNameReceived(name: String) {
        val textView: TextView = findViewById(R.id.name)
        textView.text = name
    }

    override fun onProfileNameRequestFailed(exception: Exception) {
        TODO("Not yet implemented")
    }
}