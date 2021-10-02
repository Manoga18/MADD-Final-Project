package com.example.maddfinalproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Calldesigner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calldesigner)


        val callui = findViewById<ImageButton>(R.id.imageButton45)
        callui.setOnClickListener {
            val intent = Intent(this,DesignerMainUI::class.java)
            startActivity(intent)
        }
    }
}