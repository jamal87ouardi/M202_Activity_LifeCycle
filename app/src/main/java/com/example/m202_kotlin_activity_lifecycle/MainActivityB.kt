package com.example.m202_kotlin_activity_lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("B", "onCreate() appelé")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_b)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("B", "onStart() appelé")
    }

    override fun onResume() {
        super.onResume()
        Log.d("B", "onResume() appelé")
    }

    override fun onPause() {
        super.onPause()
        Log.d("B", "onPause() appelé")
    }

    override fun onStop() {
        super.onStop()
        Log.d("B", "onStop() appelé")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("B", "onDestroy() appelé")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("B", "onSaveInstanceState() appelé")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("B", "onRestoreInstanceState() appelé")
    }
}