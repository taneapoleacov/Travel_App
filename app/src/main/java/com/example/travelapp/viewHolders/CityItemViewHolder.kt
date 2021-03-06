package com.example.travelapp.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.R
import com.example.travelapp.models.CityItem
import com.squareup.picasso.Picasso

class CityItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private var headerTextView: TextView = view.findViewById(R.id.country_name)
    private var imageView: ImageView = view.findViewById(R.id.country_image)

    fun bind(item: CityItem) {
        headerTextView.text = item.name
        Picasso.get().load(item.image).into(imageView)
    }
}