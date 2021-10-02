package com.example.maddfinalproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val worksbtn = findViewById<TextView>(R.id.textView30)
        worksbtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

//        val shopbtn = findViewById<TextView>(R.id.textView31)
//        shopbtn.setOnClickListener {
//            val intent = Intent(this,shop::class.java)
//            startActivity(intent)
//        }

        val rentbtn = findViewById<TextView>(R.id.uiRents)
        rentbtn.setOnClickListener {
            val intent = Intent(this,Rents::class.java)
            startActivity(intent)
        }

        val designerbtn = findViewById<TextView>(R.id.textView33)
        designerbtn.setOnClickListener {
            val intent = Intent(this,DesignerMainUI::class.java)
            startActivity(intent)
        }

        val menubutton = findViewById<TextView>(R.id.textView37)
        menubutton.setOnClickListener {
            Toast.makeText(this,"Log Out", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}