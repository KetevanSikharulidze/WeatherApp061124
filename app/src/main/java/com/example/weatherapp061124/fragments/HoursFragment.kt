package com.example.weatherapp061124.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp061124.R
import com.example.weatherapp061124.adapters.WeatherAdapter
import com.example.weatherapp061124.databinding.FragmentDaysBinding
import com.example.weatherapp061124.databinding.FragmentHoursBinding
import com.example.weatherapp061124.models.WeatherItem

class HoursFragment : Fragment() {

    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        hoursRcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        hoursRcView.adapter = adapter
        val list = listOf(
            WeatherItem("",
                "11:00",
                "Sunny",
                "",
                "3C",
                "",
                "",
                ""),
            WeatherItem("",
                "12:00",
                "Rainy",
                "",
                "3C",
                "",
                "",
                ""),
            WeatherItem("",
                "13:00",
                "Sunny",
                "",
                "3C",
                "",
                "",
                ""),
            WeatherItem("",
                "14:00",
                "Sunny",
                "",
                "3C",
                "",
                "",
                ""),
        )
        adapter.submitList(list)
    }

    companion object {
         @JvmStatic
        fun newInstance() = HoursFragment()
    }
}