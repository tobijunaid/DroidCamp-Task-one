package com.example.tobijunaid.gunsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btn_our_guns.setOnClickListener {
           val intent = Intent(this, SecondActivity::class.java)
           startActivity(intent)
       }
    }
}
