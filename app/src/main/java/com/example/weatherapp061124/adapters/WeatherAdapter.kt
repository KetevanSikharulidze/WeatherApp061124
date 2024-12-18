package com.example.weatherapp061124.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp061124.R
import com.example.weatherapp061124.databinding.ItemWeatherBinding
import com.example.weatherapp061124.models.WeatherItem

class WeatherAdapter : ListAdapter<WeatherItem,WeatherAdapter.Holder>(Comparator()) {

    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemWeatherBinding.bind(view)
        fun bind(item: WeatherItem) = with(binding){
            tvDate.text = item.time
            tvTemp.text = item.currentTemp
            tvCondition.text = item.condition
        }
    }

    class Comparator: DiffUtil.ItemCallback<WeatherItem>(){
        override fun areItemsTheSame(oldItem: WeatherItem, newItem: WeatherItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: WeatherItem, newItem: WeatherItem): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_weather,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }
}