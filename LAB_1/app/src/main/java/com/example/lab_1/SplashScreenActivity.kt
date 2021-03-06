package com.example.lab_1

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        Thread(Runnable {
            Thread.sleep(2000)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }).start()
    }
}