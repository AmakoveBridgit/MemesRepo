package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme4 : AppCompatActivity() {
    lateinit var button3:Button
    lateinit var button8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            var forward=Intent(this,Meme5::class.java)
            startActivity(forward)
        }
        button8=findViewById(R.id.button8)
        button8.setOnClickListener {
            val backwards=Intent(this,meme3::class.java)
            startActivity(backwards)
        }
    }
}