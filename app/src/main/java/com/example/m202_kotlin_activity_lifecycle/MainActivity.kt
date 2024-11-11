package com.example.m202_kotlin_activity_lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("A", "onCreate() appelé")

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val but = findViewById<Button>(R.id.button)

        but.setOnClickListener {
            val intent = Intent(this, MainActivityB::class.java)
            startActivity(intent)

        }


    }

    override fun onStart() {
        super.onStart()
        Log.d("A", "onStart() appelé")
    }

    override fun onResume() {
        super.onResume()
        Log.d("A", "onResume() appelé")
    }

    override fun onPause() {
        super.onPause()
        Log.d("A", "onPause() appelé")
    }

    override fun onStop() {
        super.onStop()
        Log.d("A", "onStop() appelé")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("A", "onDestroy() appelé")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("A", "onSaveInstanceState() appelé")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("A", "onRestoreInstanceState() appelé")
    }
}