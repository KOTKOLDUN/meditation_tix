package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
        findViewById<TextView>(R.id.tvDelete).setOnClickListener { finish() }
        findViewById<TextView>(R.id.tvClose).setOnClickListener { finish() }
    }
}
