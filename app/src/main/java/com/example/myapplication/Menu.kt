package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        registerForContextMenu(textView13)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.context,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option_1->
            {
                android.widget.Toast.makeText(this,"You have selected option 1",android.widget.Toast.LENGTH_SHORT).show()
            }
            R.id.option_2->
            {
                android.widget.Toast.makeText(this,"You have selected option 2",android.widget.Toast.LENGTH_SHORT).show()
            }
            else ->
                android.widget.Toast.makeText(this,"Please select either 1 or 2",android.widget.Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }

}