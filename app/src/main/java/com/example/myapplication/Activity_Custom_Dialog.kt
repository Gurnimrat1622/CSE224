package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_custom_dialog.*
import java.util.*
import kotlin.collections.ArrayList

class Activity_Custom_Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_dialog)
        btn1.setOnClickListener(){
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Simple Alert")
                .setMessage("It is Simple Alert Message")
                .setPositiveButton("Ok"){dialog,which->
                    android.widget.Toast.makeText(this,"Ok button was clicked",android.widget.Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Not Ok"){dialog,which->
                    android.widget.Toast.makeText(this,"Not Ok button was clicked",android.widget.Toast.LENGTH_LONG).show()
                }
                .setCancelable(true)
                .show()
        }
        button11.setOnClickListener(){
            val items= arrayOf("CSE","ECE","EEE","CIVIL","Other Engg")
            val builder=AlertDialog.Builder(this)
            builder.setTitle("List of Items")
                .setItems(items){dialog,which->
                    android.widget.Toast.makeText(this,items[which]+ "clicked",android.widget.Toast.LENGTH_LONG).show()
                }
                .setPositiveButton("Ok",null)
                .setNegativeButton("Not OK",null)
                .setNeutralButton("Nothing",null)
                val ad=builder.create()
            ad.show()

            multipleChoice.setOnClickListener(){
                val selecteditem=ArrayList<String>()
                val item= arrayOf("Apple","Banana","Orange","Grapes")
                val builder = AlertDialog.Builder(this)
                    .setTitle("Multiple Choice Option")
                    .setMultiChoiceItems(item,null){dialog,which,isChecked->
                        if(isChecked)
                            selecteditem.add(item[which])
                        else if(selecteditem.contains((item[which])))
                            selecteditem.remove(item[which])

                    }
                    .setPositiveButton("Done"){dialog,i->
                        android.widget.Toast.makeText(this,"item Selected :"+ Arrays.toString(selecteditem.toTypedArray()),android.widget.Toast.LENGTH_LONG).show()
                    }
                    builder.show()
            }
        }
    }
}