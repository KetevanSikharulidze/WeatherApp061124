package com.example.weatherapp061124.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weatherapp061124.R
import com.example.weatherapp061124.databinding.FragmentDaysBinding
import com.example.weatherapp061124.databinding.FragmentHoursBinding

class DaysFragment : Fragment() {

    private lateinit var binding: FragmentDaysBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = DaysFragment()
    }
}