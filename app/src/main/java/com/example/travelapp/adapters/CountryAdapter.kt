package com.example.travelapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.R
import com.example.travelapp.models.CountryItem
import com.example.travelapp.viewHolders.CountryItemViewHolder

class CountryAdapter(private val dataSet: Array<CountryItem>) : RecyclerView.Adapter<CountryItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryItemViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.country_cell, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return CountryItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryItemViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.bind(dataSet[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size
}