package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ImageAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_adapter)

        val view = findViewById<TextView>(R.id.textView4)
        val img = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.button3)

        btn.setOnClickListener(){
            startActivity(Intent(this,Activity1::class.java))
        }
    }
}