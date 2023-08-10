package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_check_box.*
import kotlinx.android.synthetic.main.activity_check_box.txt
import kotlinx.android.synthetic.main.activity_form_app.*
import kotlinx.android.synthetic.main.activity_implicit_ex.*
import kotlinx.android.synthetic.main.activity_implicit_ex.view.*

class ImplicitEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_ex)

       dialler.setOnClickListener(){
           val dial_int=Intent(Intent.ACTION_DIAL)
           dial_int.setData(Uri.parse("tel:+919700665544"))
           startActivity(dial_int)
       }
        btnCamera.setOnClickListener(){
            val cam_int = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cam_int)
        }
        call.setOnClickListener(){
            val call_int=Intent(Intent.ACTION_VIEW)
            call_int.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(call_int)
        }
        contact.setOnClickListener(){
            val cont_int=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(cont_int)
        }
        gallery.setOnClickListener(){
            val img_int = Intent()
            img_int.action=Intent.ACTION_VIEW
            img_int.type="image/*"
            startActivity(img_int)
        }


    }
}