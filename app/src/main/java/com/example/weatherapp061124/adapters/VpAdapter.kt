package com.example.weatherapp061124.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.weatherapp061124.fragments.DaysFragment
import com.example.weatherapp061124.fragments.HoursFragment

class VpAdapter(fa: FragmentActivity, val list: List<Fragment>) : FragmentStateAdapter(fa) {

    override fun getItemCount() = list.size

    override fun createFragment(position: Int): Fragment {
            return list[position]
    //        return when(position){
//            0 -> HoursFragment()
//            1 -> DaysFragment()
//            else -> HoursFragment()
//        }
    }
}