package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonupload=findViewById<Button>(R.id.btnupload)
        val buttondownload=findViewById<Button>(R.id.btndownload)
        val buttondark=findViewById<Button>(R.id.btndark)
        val buttonlight = findViewById<Button>(R.id.btnlight)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)

        buttonupload.setOnClickListener {
            Toast.makeText(applicationContext,"Your video is  uploading.....",Toast.LENGTH_LONG).show()
        }

        buttondownload.setOnClickListener {
            Toast.makeText(applicationContext,"Your video is downloading.....",Toast.LENGTH_LONG).show()
        }



    }
}