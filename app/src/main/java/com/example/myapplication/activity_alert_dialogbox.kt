package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialogbox.*

class activity_alert_dialogbox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialogbox)
        button10.setOnClickListener(){
            val builder=AlertDialog.Builder(this)
            builder.setTitle("My Alert Dialog")
                .setMessage("Do you want to close it..?")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes") { dialogInterface, which ->
                android.widget.Toast.makeText(this, "Yes option clicked", android.widget.Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){ dialogInterface,which->
                android.widget.Toast.makeText(this,"No option clicked",android.widget.Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){ dialogInterface,which->
                android.widget.Toast.makeText(this,"Cancel option clicked",android.widget.Toast.LENGTH_LONG).show()
            }
            val ad:AlertDialog=builder.create()
            ad.show()
        }
    }
}