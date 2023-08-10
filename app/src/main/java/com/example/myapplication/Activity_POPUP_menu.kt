package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_popup_menu.*

class Activity_POPUP_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)
        button9.setOnClickListener(){
            val pmenu = PopupMenu(this,button9)
            pmenu.menuInflater.inflate(R.menu.popup_menu,pmenu.menu)
        pmenu.setOnMenuItemClickListener {
            android.widget.Toast.makeText(this,"You have selected : "+it.title,android.widget.Toast.LENGTH_SHORT).show()
            true
        }
            pmenu.show()

        }


    }
}