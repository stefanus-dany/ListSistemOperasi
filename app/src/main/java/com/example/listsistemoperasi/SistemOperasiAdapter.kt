package com.example.listsistemoperasi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


class SistemOperasiAdapter :
    RecyclerView.Adapter<SistemOperasiAdapter.ViewHolder>() {

    lateinit var dataOS: MutableList<SistemOperasiModel>
    lateinit var mContext: Context

    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var osName: TextView = itemview.findViewById(R.id.osName)
        var iv: ImageView = itemview.findViewById(R.id.iv)
        var osDesc: TextView = itemview.findViewById(R.id.osDesc)
        var fav: ImageView = itemview.findViewById(R.id.fav)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_os, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tmp = dataOS[position]
        holder.iv.setImageResource(tmp.photo)
        holder.osName.text = tmp.name
        holder.osDesc.text = tmp.desc
        holder.itemView.setOnClickListener {
            val intent = Intent(mContext, Detail::class.java)
            intent.putExtra("osName", tmp.name)
            intent.putExtra("osDescDetail", tmp.descDetail)
            intent.putExtra("developedBy", tmp.developedBy)
            intent.putExtra("initialRelease", tmp.initialRelease)
            intent.putExtra("location", tmp.location)
            intent.putExtra("imageView", tmp.photo)
            intent.putExtra("imageView1", tmp.photo1)
            intent.putExtra("imageView2", tmp.photo2)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            mContext.startActivity(intent)
        }

        var count = false
        holder.fav.setOnClickListener {
            count = if (!count) {
                holder.fav.setColorFilter(
                    ContextCompat.getColor(mContext, R.color.red),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                true
            } else {
                holder.fav.setColorFilter(
                    ContextCompat.getColor(mContext, R.color.grayLight),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                false
            }
        }
    }

    override fun getItemCount(): Int {
        return dataOS.size
    }
}