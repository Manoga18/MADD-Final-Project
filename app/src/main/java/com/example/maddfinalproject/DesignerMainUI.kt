package com.example.maddfinalproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DesignerMainUI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_designer_main_ui)

        val clickme = findViewById<ImageButton>(R.id.imageButton28)
        clickme.setOnClickListener {
            val intent = Intent(this,Portfolio::class.java)
            startActivity(intent)
        }

        val callui = findViewById<ImageButton>(R.id.imageButton40)
        callui.setOnClickListener {
            val intent = Intent(this,Calldesigner::class.java)
            startActivity(intent)
        }

    }
}

