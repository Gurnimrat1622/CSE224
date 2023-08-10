package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    lateinit var lst_view: ListView
    lateinit var layoutmain: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        lst_view = findViewById(R.id.lst_view)
        layoutmain = findViewById(R.id.layoutMain)

        var arr = arrayOf(Color.RED, Color.BLUE, Color.GRAY, Color.CYAN, Color.YELLOW)
        var b = arrayOf("RED", "BLUE", "GRAY", "CYAN", "YELLOW")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lst_view.adapter = adapter

        lst_view.setOnItemClickListener{adapterView, view, i, l->
            layoutmain.setBackgroundColor(arr[i])

        }

    }
}