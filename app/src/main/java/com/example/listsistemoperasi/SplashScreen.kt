package com.example.listsistemoperasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SplashScreen : AppCompatActivity() {

    private lateinit var splash : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        splash = findViewById(R.id.splash)
        supportActionBar?.hide()
        splash.alpha = 0f
        splash.animate().setDuration(1500).alpha(1f).withEndAction{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

    }
}