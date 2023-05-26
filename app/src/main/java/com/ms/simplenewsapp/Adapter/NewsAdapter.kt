package com.ms.simplenewsapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.imageview.ShapeableImageView
import com.ms.simplenewsapp.Data.NewsData
import com.ms.simplenewsapp.R

class NewsAdapter(private val newsList : ArrayList<NewsData>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val items = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return NewsViewHolder(items)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.img.setImageResource(currentItem.img)
        holder.newsHeading.text = currentItem.heading
        holder.newsDescription.text = currentItem.description
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class NewsViewHolder(itemView : View) : ViewHolder(itemView) {
        val img : ShapeableImageView = itemView.findViewById(R.id.image)
        val newsHeading : TextView = itemView.findViewById(R.id.newsHeading)
        val newsDescription : TextView = itemView.findViewById(R.id.newsDescription)
    }

}