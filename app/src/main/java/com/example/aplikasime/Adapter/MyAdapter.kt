package com.example.aplikasime.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.aplikasime.Fragments.Galerisaya
import com.example.aplikasime.Fragments.Galeriteman

internal class MyAdapter (var context: Context, fm: FragmentManager, var totalTabs: Int ) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                Galerisaya()
            }
            1 -> {
                Galeriteman()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}