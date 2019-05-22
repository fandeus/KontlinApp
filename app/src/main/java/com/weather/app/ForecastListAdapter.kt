package com.weather.app

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * author: VenRen
 * created on: 2019/5/17 15:22
 * description:
 */
class ForecastListAdapter(private val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemText.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(val itemText: TextView) : RecyclerView.ViewHolder(itemText)
}