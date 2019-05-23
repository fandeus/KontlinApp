package com.weather.app

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.weather.app.domain.model.ForecastList

/**
 * author: VenRen
 * created on: 2019/5/17 15:22
 * description:
 */
class ForecastListAdapter(private val weekForecast: ForecastList) :
    RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast.dailyForecast[position]) {
            holder.itemText.text = "$data - $description - $high/ $low"
        }
    }

    override fun getItemCount(): Int = weekForecast.dailyForecast.size


    class ViewHolder(val itemText: TextView) : RecyclerView.ViewHolder(itemText)
}