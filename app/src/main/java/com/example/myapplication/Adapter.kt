package com.example.myapplication

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var content:ArrayList<Golden>
):RecyclerView.Adapter<Adapter.ViewHolder>(){
    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val images:ImageView = itemView.findViewById(R.id.profile)
        val names:TextView= itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return content.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curItem = content[position]
        holder.images.setImageResource(curItem.image)
        holder.names.text = curItem.name
    }
}