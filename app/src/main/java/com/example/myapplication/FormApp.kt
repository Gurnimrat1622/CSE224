package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FormApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_app)
         val name = findViewById<EditText>(R.id.Name)
        val password = findViewById<EditText>(R.id.Password)
        val email = findViewById<EditText>(R.id.Email)
        val date = findViewById<EditText>(R.id.Date)
        val phone = findViewById<EditText>(R.id.Phone_Number)
        val btn = findViewById<Button>(R.id.btn_1)
        val rev = findViewById<TextView>(R.id.rev)

        btn.setOnClickListener(){
            val t1 = name.text.toString()
            val t2 = password.text.toString()
            val t3 = email.text.toString()
            val t4 = date.text.toString()
            val t5 = phone.text.toString()
             if(t1.isEmpty() || t2.isEmpty() || t3.isEmpty() || t4.isEmpty() || t5.isEmpty()) {
                 rev.text = "Enter All The Values"
             } else{
                 rev.text = " Entered Values are : \n " +
                         "Name : ${t1} \n" +
                         "Password : ${t2} \n" +
                         "Email : ${t3} \n" +
                         "Date : ${t4} \n" +
                         "Phone No. : ${t5} \n"

             }
        }
    }
}