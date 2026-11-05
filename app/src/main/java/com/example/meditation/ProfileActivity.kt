package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val open = { startActivity(Intent(this, PhotoActivity::class.java)) }
        findViewById<android.view.View>(R.id.photo1).setOnClickListener { open() }
        findViewById<android.view.View>(R.id.photo2).setOnClickListener { open() }
        findViewById<android.view.View>(R.id.photo3).setOnClickListener { open() }
        findViewById<android.view.View>(R.id.photo4).setOnClickListener { open() }
    }
}
