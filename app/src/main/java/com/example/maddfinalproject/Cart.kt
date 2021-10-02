package com.example.maddfinalproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val backbtn = findViewById<ImageView>(R.id.imageView33)
        backbtn.setOnClickListener {
            val intent = Intent(this,Rentstore::class.java)
            startActivity(intent)
        }

    }
}

