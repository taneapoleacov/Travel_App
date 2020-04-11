package com.example.travelapp.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.R
import com.example.travelapp.models.ExperienceItem
import com.squareup.picasso.Picasso

class ExperienceItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var titleTextView: TextView = view.findViewById(R.id.experience_title)
    private var imageView: ImageView = view.findViewById(R.id.experience_image)

    fun bind(item: ExperienceItem) {
        titleTextView.text = item.title
        Picasso.get().load(item.image).into(imageView)
    }
}