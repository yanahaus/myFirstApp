package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       button.setOnClickListener {
           Log.e("!@#", "'Button 1 have been pressed")
               }
        button2.setOnClickListener {
            Log.e("!@#", "'Button 2 have been pressed")
        }
        button3.setOnClickListener {
            Log.e("!@#", "'Button 3 have been pressed")
        }
        button4.setOnClickListener {
            Log.e("!@#", "'Button 4 have been pressed")
        }
    }
}