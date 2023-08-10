package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout
import kotlinx.android.synthetic.main.activity_1.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_radio.*
import kotlinx.android.synthetic.main.activity_snack_bar.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button2.setOnClickListener(){
            val name:String = url.text.toString()
            textView12.text = "Hi $name, you are registered!"
            val snack = Snackbar.make(view, "This is snackbar text", Snackbar.LENGTH_INDEFINITE)
            snack.setAction("undo"){
                textView12.setText("$name Successfully deregistered")
                val snack:SnackBar
            }
            snack.setTextColor(Color.WHITE)
            snack.setBackgroundTint(Color.RED)
            snack.show()
        }
    }
}