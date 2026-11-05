package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        android.os.Handler(mainLooper).postDelayed({
            startActivity(Intent(this, OnboardingActivity::class.java))
            finish()
        }, 2000)
    }
}
