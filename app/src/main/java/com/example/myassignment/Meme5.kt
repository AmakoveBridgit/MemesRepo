package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme5 : AppCompatActivity() {
    lateinit var button5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {
            val backward=Intent(this,Meme4::class.java)
            startActivity(backward)
        }
    }
}