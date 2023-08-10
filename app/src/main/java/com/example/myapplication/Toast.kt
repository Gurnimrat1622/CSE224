package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toast.*

class Toast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        btntoast1.setOnClickListener(){
            Toast.makeText(this,"I am your Toast Message", Toast.LENGTH_LONG).show()
            val ts1=Toast.makeText(this,"Hello It is Toast",Toast.LENGTH_SHORT)
            ts1.show()
            val ts2=Toast.makeText(this,"Toast with Gravity",Toast.LENGTH_SHORT)
            ts2.setGravity(Gravity.LEFT,0,0)
            ts2.show()
        }
    }
}