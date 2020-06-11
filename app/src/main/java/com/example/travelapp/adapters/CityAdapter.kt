package com.example.travelapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.R
import com.example.travelapp.models.CityItem
import com.example.travelapp.viewHolders.CityItemViewHolder

class CityAdapter (private val dataSet: Array<CityItem>) : RecyclerView.Adapter<CityItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityItemViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.country_cell, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return CityItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.bind(dataSet[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size
}