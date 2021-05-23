package com.example.listsistemoperasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    private lateinit var osNameDetail : TextView
    private lateinit var osDescDetail : TextView
    private lateinit var ivDetail : ImageView
    private lateinit var backButton : ImageView
    private lateinit var developedByDetail : TextView
    private lateinit var initialReleaseDetail : TextView
    private lateinit var locationDetail : TextView
    private lateinit var photo1Detail : ImageView
    private lateinit var photo2Detail : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)
        supportActionBar?.hide()
        val osName = intent.getStringExtra("osName")
        val osDesc = intent.getStringExtra("osDescDetail")
        val developedBy = intent.getStringExtra("developedBy")
        val initialRelease = intent.getStringExtra("initialRelease")
        val location = intent.getStringExtra("location")
        val imageView = intent.getIntExtra("imageView", 0)
        val imageView1 = intent.getIntExtra("imageView1", 0)
        val imageView2 = intent.getIntExtra("imageView2", 0)

        osNameDetail = findViewById(R.id.osNameDetail)
        osDescDetail = findViewById(R.id.osDescDetail)
        ivDetail = findViewById(R.id.ivDetail)
        developedByDetail = findViewById(R.id.developedBy)
        initialReleaseDetail = findViewById(R.id.initialRelease)
        locationDetail = findViewById(R.id.location)
        photo1Detail = findViewById(R.id.photo1)
        photo2Detail = findViewById(R.id.photo2)

        osNameDetail.text = osName
        osDescDetail.text = osDesc
        developedByDetail.text = developedBy
        initialReleaseDetail.text = initialRelease
        locationDetail.text = location
        ivDetail.setImageResource(imageView)
        photo1Detail.setImageResource(imageView1)
        photo2Detail.setImageResource(imageView2)
        backButton = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}