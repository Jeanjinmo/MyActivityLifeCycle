package com.example.myactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate: Sedang Berada di onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: Sedang Berada di onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: Sedang Berada di onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: Sedang Berada di onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("MainActivity", "onStop: Sedang Berada di onStop")
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy: Sedang Berada di onDestroy")
        super.onDestroy()
    }
}