package com.bugbd.code.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bugbd.code.inner.TopFanCommentFragment
import com.bugbd.code.inner.TopFanLikeFragment

class TopFollowPagerAdapter(
    fragment: Fragment,
) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TopFanCommentFragment()
            1 -> TopFanLikeFragment()
            else -> TopFanCommentFragment()
        }

    }


}