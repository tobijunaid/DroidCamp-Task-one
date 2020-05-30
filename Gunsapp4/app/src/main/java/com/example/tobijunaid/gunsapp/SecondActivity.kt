package com.example.tobijunaid.gunsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), recyclerViewAdapter.OnItemClickListener {

    override fun onItemClick(user: userDataModel) {

        var intent = Intent(this@SecondActivity, detailedActivity::class.java)
        intent.putExtra("Title", user.title)
        intent.putExtra("Desc", user.desc)
        intent.putExtra("Profile_img", user.img)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var recyclerViewAdapter:RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val user = ArrayList<userDataModel>()

        user.add(userDataModel("M60", "$1250",   R.drawable.m60))
        user.add(userDataModel("M16", "$1300",  R.drawable.m16))
        user.add(userDataModel("M4 AWST", "$1350",  R.drawable.m4_awst))
        user.add(userDataModel("AK47", "$1300",  R.drawable.ak47))
        user.add(userDataModel("AK74", "$1400",  R.drawable.ak74))
        user.add(userDataModel("DRAGUNOV", "$1350",  R.drawable.dragunov))
        user.add(userDataModel("MP5", "$1230", R.drawable.mp5))
        //user.add(userDataModel("G36", "$1200", R.drawable.g36))
        //user.add(userDataModel("UZI", "$1150", R.drawable.uzi))
        //user.add(userDataModel("M9", "$960", R.drawable.m9))
        //user.add(userDataModel("P226", "$890", R.drawable.p226))
        //user.add(userDataModel("PM50", "$850", R.drawable.pm50))
        //user.add(userDataModel("TMP", "$1100", R.drawable.tmp))
        //user.add(userDataModel("RPG-7", "$1780 And a permit of usage", R.drawable.rpg_7))
        //user.add(userDataModel("Desert Eagle", "$1170", R.drawable.desert_eagle))

        var adapter = recyclerViewAdapter(this, user, this)

        recyclerView.adapter = adapter
    }


}

