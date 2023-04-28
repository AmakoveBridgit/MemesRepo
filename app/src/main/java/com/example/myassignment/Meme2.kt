package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme2 : AppCompatActivity() {
    lateinit var button:Button
    lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        button= findViewById(R.id.button)
        button.setOnClickListener {
            val forward=Intent(this,meme3::class.java)
            startActivity(forward)
        }
        button4=findViewById(R.id.button4)
        button4.setOnClickListener {
            val backward=Intent(this,MainActivity::class.java)
            startActivity(backward)
        }


    }
}