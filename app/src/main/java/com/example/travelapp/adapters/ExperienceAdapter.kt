package com.example.travelapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.R
import com.example.travelapp.models.ExperienceItem
import com.example.travelapp.viewHolders.ExperienceItemViewHolder

class ExperienceAdapter(private val myDataset: Array<ExperienceItem>) : RecyclerView.Adapter<ExperienceItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.experience_cell, parent, false)

        return ExperienceItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExperienceItemViewHolder, position: Int) {
        holder.bind(myDataset[position])
    }

    override fun getItemCount() = myDataset.size
}