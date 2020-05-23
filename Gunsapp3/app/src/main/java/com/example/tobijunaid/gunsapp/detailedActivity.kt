package com.example.tobijunaid.gunsapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detailed.*

class detailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val title = intent.getStringExtra("Title")
        val desc = intent.getStringExtra("Desc")
        val profileimg = intent.getIntExtra("Profile_img", Activity.DEFAULT_KEYS_DISABLE)

        val tvTitle:TextView = findViewById(R.id.tvTitle)
        val tvDesc:TextView = findViewById(R.id.tvDesc)

        tvTitle.text = title.toString()
        tvDesc.text = desc.toString()
        profile_image.setImageResource(profileimg)

        /*btn_Buy_now.setOnClickListener {
            Toast.makeText(this, "Sorry, You can't buy now", Toast.LENGTH_SHORT).show()
        }*/
    }
}
