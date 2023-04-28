package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button6 = findViewById(R.id.button6)
        button6.setOnClickListener {
            val forward = Intent(this, Meme2::class.java)
            startActivity(forward)
        }
    }
}