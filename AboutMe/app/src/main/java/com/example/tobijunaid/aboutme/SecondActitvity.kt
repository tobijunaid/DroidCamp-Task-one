package com.example.tobijunaid.aboutme

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tobijunaid.aboutme.R.drawable.imgtobi1
import kotlinx.android.synthetic.main.activity_second.*

class SecondActitvity : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        /*imgTobi1.setOnClickListener {
            Toast.makeText(this, "This is me", Toast.LENGTH_SHORT)
        }*/

        val bundle: Bundle? = intent.extras

        btnSayHello.setOnClickListener {
            Toast.makeText(this, "Hey Tobi!, Stay safe!!!", Toast.LENGTH_SHORT).show()
        }
    }
}