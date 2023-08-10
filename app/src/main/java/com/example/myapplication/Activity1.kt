package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R.*
import kotlinx.android.synthetic.main.activity_1.*

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_1)

        btn_submit1.setOnClickListener(){
            startActivity(Intent(this,ImageAdapter::class.java))
        }

    }
}