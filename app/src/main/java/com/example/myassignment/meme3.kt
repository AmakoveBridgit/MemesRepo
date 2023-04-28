package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme3 : AppCompatActivity() {
    lateinit var button2:Button
    lateinit var button7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val forward=Intent(this,Meme4::class.java)
            startActivity(forward)
        }
        button7=findViewById(R.id.button7)
        button7.setOnClickListener {
            val backwards=Intent(this,meme3::class.java)
            startActivity(backwards)
        }
    }
}