package com.example.maddfinalproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class Rentstore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rentstore)

        val menuBtn = findViewById<ImageView>(R.id.imageView28)
        menuBtn.setOnClickListener {
            val intent = Intent(this,RentProductView::class.java)
            startActivity(intent)
        }

        val downlaodbtn = findViewById<ImageView>(R.id.imageButton20)
        downlaodbtn.setOnClickListener {
            val intent = Intent(this,Rentstore::class.java)
            startActivity(intent)
        }
    }
}