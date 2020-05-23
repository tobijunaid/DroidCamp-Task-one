package com.example.tobijunaid.gunsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class detailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var title = intent.getStringExtra("Title")
        var desc = intent.getStringExtra("Desc")

        var tvTitle:TextView = findViewById(R.id.tvTitle)
        var tvDesc:TextView = findViewById(R.id.tvDesc)

        tvTitle.text = title.toString()
        tvDesc.text = desc.toString()
    }
}
