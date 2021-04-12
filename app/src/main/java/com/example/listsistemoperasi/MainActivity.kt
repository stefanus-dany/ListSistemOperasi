package com.example.listsistemoperasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : SistemOperasiAdapter
    lateinit var data : MutableList<SistemOperasiModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        data = mutableListOf()
        adapter = SistemOperasiAdapter(data)
        adapter.mContext = applicationContext
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        init()
    }

    fun init(){
        data.add(SistemOperasiModel(R.drawable.android, "Android"))
        data.add(SistemOperasiModel(R.drawable.ic_baseline_shop_24, "Windows Mobile"))
        data.add(SistemOperasiModel(R.drawable.iphone, "Iphone"))
        data.add(SistemOperasiModel(R.drawable.apple, "Blackberry"))
        data.add(SistemOperasiModel(R.drawable.android, "Web OS"))
        data.add(SistemOperasiModel(R.drawable.ic_baseline_shop_24, "Ubuntu"))
        data.add(SistemOperasiModel(R.drawable.iphone, "Windows 7"))
        data.add(SistemOperasiModel(R.drawable.apple, "Mac OS X"))
    }
}