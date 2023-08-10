package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button7.setOnClickListener(){
            var url:String=editTextTextPersonName2.text.toString()
            var url_int=Intent(Intent.ACTION_SEND)
            url_int.setType(url)
            startActivity(url_int)
        }
    }
}