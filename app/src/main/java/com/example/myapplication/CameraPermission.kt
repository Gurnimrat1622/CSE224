package com.example.myapplication

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_camera_permission.*

class CameraPermission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_permission)
        val requestCamera=registerForActivityResult(ActivityResultContracts.RequestPermission(),{
            if(it)
            {
                android.widget.Toast.makeText(this,"Permissiion granted",android.widget.Toast.LENGTH_SHORT).show()
            }
            else{
                android.widget.Toast.makeText(this,"Permissiion Not granted",android.widget.Toast.LENGTH_SHORT).show()
            }
        })
        camera.setOnClickListener(){
            requestCamera.launch(Manifest.permission.CAMERA)
        }
 }
}