package com.example.listsistemoperasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SistemOperasiAdapter(val dataOS : MutableList<SistemOperasiModel>) : RecyclerView.Adapter<SistemOperasiAdapter.ViewHolder>() {

    lateinit var  mContext : Context

    inner class ViewHolder (itemview : View) : RecyclerView.ViewHolder(itemview){
        var osName = itemview.findViewById<TextView>(R.id.osName)
        var iv = itemview.findViewById<ImageView>(R.id.iv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_os, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.iv.setImageResource(dataOS[position].photo)
        holder.osName.text = dataOS[position].name
        holder.itemView.setOnClickListener {
            Toast.makeText(mContext, dataOS[position].name, Toast.LENGTH_SHORT).show()
            dataOS.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return dataOS.size
    }
}