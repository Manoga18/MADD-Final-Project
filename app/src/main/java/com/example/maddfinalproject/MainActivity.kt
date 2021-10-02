package com.example.maddfinalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.time.Instant

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        val btnProfile = findViewById<Button>(R.id.menuBtn)
//        btnProfile.setOnClickListener {
//            val intent = Intent(this, works::class.java)
//            works(intent)
//        }

        val menubutton = findViewById<ImageButton>(R.id.menuBtn)
        menubutton.setOnClickListener {
//            Toast.makeText(this,"Button Click", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }

        val clickme = findViewById<ImageButton>(R.id.imageButton5)
        clickme.setOnClickListener {
            val intent = Intent(this,Rents::class.java)
            startActivity(intent)
        }

        val profilebtn = findViewById<TextView>(R.id.textView11)
        profilebtn.setOnClickListener {
            val intent = Intent(this,works::class.java)
            startActivity(intent)
        }

        val callbtn = findViewById<ImageButton>(R.id.callBtn)
        callbtn.setOnClickListener {
            val intent = Intent(this,callui::class.java)
            startActivity(intent)
        }


    }
    }



