package com.guillermolyh.lyh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "Nuestros Servicios"


        Toast.makeText(this,getString(R.string.welcome),Toast.LENGTH_SHORT).show()
    }
}