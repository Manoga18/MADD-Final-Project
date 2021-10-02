package com.example.maddfinalproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Rents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rents)

        val menubutton = findViewById<ImageButton>(R.id.menuBtn)
        menubutton.setOnClickListener {
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }

        val menuBtn = findViewById<ImageButton>(R.id.imageButton3)
        menuBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val designerbtn = findViewById<ImageButton>(R.id.imageButton6)
        designerbtn.setOnClickListener {
            val intent = Intent(this,DesignerMainUI::class.java)
            startActivity(intent)
        }

        val rentstorebtn = findViewById<ImageButton>(R.id.imageButton7)
        rentstorebtn.setOnClickListener {
            val intent = Intent(this,Rentstore::class.java)
            startActivity(intent)
        }
    }
}