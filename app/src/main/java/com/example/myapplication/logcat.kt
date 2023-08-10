package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logcat.*

class logcat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logcat)
        btn12log.setOnClickListener() {
            if (editTextTextPersonName3.text.toString()
                    .isEmpty() || editTextTextPersonName4.text.toString().isEmpty()
            ) {
                Toast.makeText(this, "provide login id and password", Toast.LENGTH_LONG).show()
                Log.i("mail", "Enter mail id")
                Log.w("pwd", "Enter password")
            }
        }
    }
}