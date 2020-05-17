package com.example.tobijunaid.aboutme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAboutMe.setOnClickListener{
            val intent = Intent(this, SecondActitvity::class.java)
            Toast.makeText(this, "About Me", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

    }


}
