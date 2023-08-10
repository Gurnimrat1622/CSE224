package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainOptional_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_optional_menu)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optional_menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        when(id){
            R.id.settings->
            {
                android.widget.Toast.makeText(this,"You have selected Setting option",android.widget.Toast.LENGTH_SHORT).show()
                true
            }
            R.id.notification->
            {
                android.widget.Toast.makeText(this,"You have selected Notification option",android.widget.Toast.LENGTH_SHORT).show()
                true
            }
            R.id.share->
            {
                android.widget.Toast.makeText(this,"You have selected Share option",android.widget.Toast.LENGTH_SHORT).show()
                true
            }
            R.id.delete->
            {
                android.widget.Toast.makeText(this,"You have selected Delete option",android.widget.Toast.LENGTH_SHORT).show()
                true
            }
            else->{
                android.widget.Toast.makeText(this,"select any option",android.widget.Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}