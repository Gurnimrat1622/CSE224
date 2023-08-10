package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_app_choser.*

class AppChoser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_choser)

        button2.setOnClickListener {

            val location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California")
            val mapIntent = Intent(Intent.ACTION_VIEW, location)
            startActivity(mapIntent)
        }

        button3.setOnClickListener {
            var url = "http://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url),"text/plain")
            val choose = Intent.createChooser(intent, "Share URL")
            startActivity(choose)
        }
    }
}