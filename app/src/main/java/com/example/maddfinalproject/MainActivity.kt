package com.example.maddfinalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btnProfile = findViewById<Button>(R.id.btnProfile)
//        btnProfile.setOnClickListener {
//            val intent = Intent(this, works::class.java)
//            works(intent)
//        }
    }
}
