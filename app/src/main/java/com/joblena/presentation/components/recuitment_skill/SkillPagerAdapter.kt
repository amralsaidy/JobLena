package com.joblena.presentation.components.recuitment_skill

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SkillPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        when(position){
            0-> return TechnicalFragment()
            1-> return SoftSkillFragment()
            2-> return LanguageFragment()
            3-> return PreferFragment()
        }
        return TechnicalFragment()
    }


    override fun getCount(): Int {
        return 4;
    }
}