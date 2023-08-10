package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio.*

class Radio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)

       button.setOnClickListener(){
           var selectId = radioGroup.checkedRadioButtonId
           if(selectId == -1){
               Toast.makeText(this,"Please select any one!!",Toast.LENGTH_SHORT).show()
           } else{
               val rB = radioGroup.findViewById<RadioButton>(selectId)
               eng.text = "Result : ${rB.text}"
           }
       }
        button2.setOnClickListener(){
            radioGroup.clearCheck()
            eng.text = " "
        }

    }
}