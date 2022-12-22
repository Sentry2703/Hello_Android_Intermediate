package com.example.hello_android_intermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton = findViewById<Button>(R.id.helloButton)
        helloButton.setOnClickListener {
            Toast.makeText(this, "Hello to You From Tunji!", Toast.LENGTH_SHORT).show()
        }
    }
}