package com.todo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//class MainActivity : AppCompatActivity(), ProfileContract.View {
//    lateinit var presenter: ProfileContract.Presenter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        this.presenter = ProfilePresenter()
//        presenter.attach(this)
//        //Inject the presenter using Dependecy injection
//        presenter.fetchProfileName()
//    }
//
//    override fun onProfileNameReceived(name: String) {
//        val textView: TextView = findViewById(R.id.name)
//        textView.text = name
//    }
//
//    override fun onProfileNameRequestFailed(exception: Exception) {
//        TODO("Not yet implemented")
//    }
//}