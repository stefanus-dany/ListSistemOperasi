package com.example.listsistemoperasi

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {
    private lateinit var backButtonAbout : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        supportActionBar?.hide()
        backButtonAbout = findViewById(R.id.backButtonAbout)
        backButtonAbout.setOnClickListener {
            finish()
        }
    }
}