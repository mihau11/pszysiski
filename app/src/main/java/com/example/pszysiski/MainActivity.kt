package com.example.pszysiski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val label = findViewById<TextView>(R.id.textView)
        val textbox = findViewById<TextView>(R.id.editTextTextPersonName)
        findViewById<Button>(R.id.button).setOnClickListener {
            label.text = label.text.toString() + textbox.text.toString()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            label.text = "Michał Leszczyński"
        }
    }
}