package com.bugbd.code.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainTabAdapter(
    fragment: Fragment,
) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TopFanFragment()
            1 -> TopFollowFragment()
            else -> TopFanFragment()
        }

    }


}