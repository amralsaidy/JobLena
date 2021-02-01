package com.joblena.presentation.components.recuitment_job

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class JobPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return JobDescFragment()!!;
            1 -> return JobSpecFragment()!!;
        }
        return JobDescFragment()!!;
    }


    override fun getCount(): Int {
        return 2;
    }

}