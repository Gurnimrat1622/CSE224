
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)



        button4.setOnClickListener(){
            val snack = Snackbar.make(view, "Example SnackBar", Snackbar.LENGTH_LONG)
            snack.setAction("Click Me"){
                textView6.setText("SnackBar Action invoked!!")
            }
            snack.show()
        }
    }
}