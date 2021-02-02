package com.joblena.presentation.components.recuitment_skill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joblena.R
import com.joblena.domain.entities.SkillChoose
import com.joblena.presentation.adapters.SkillsAdapter


class PreferFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_prefer, container, false)


        //just temprary unitl fetch apis
        var arraylist2 = ArrayList<SkillChoose>()
        arraylist2.add(SkillChoose("product manger"));
        arraylist2.add(SkillChoose("Android developer"));
        arraylist2.add(SkillChoose("graphic designer"));
        arraylist2.add(SkillChoose("product manger"));
        arraylist2.add(SkillChoose("Android developer"));
        arraylist2.add(SkillChoose("graphic designer"));
        arraylist2.add(SkillChoose("product manger"));
        arraylist2.add(SkillChoose("Android developer"));
        arraylist2.add(SkillChoose("graphic designer"));
        arraylist2.add(SkillChoose("product manger"));
        arraylist2.add(SkillChoose("Android developer"));
        arraylist2.add(SkillChoose("graphic designer"));
        arraylist2.add(SkillChoose("product manger"));
        arraylist2.add(SkillChoose("Android developer"));
        arraylist2.add(SkillChoose("graphic designer"));
        arraylist2.add(SkillChoose("product manger"));
        arraylist2.add(SkillChoose("Android developer"));
        arraylist2.add(SkillChoose("graphic designer"));

        root.findViewById<RecyclerView>(R.id.skill_recyclerview).adapter= SkillsAdapter(arraylist2)

        return  root
    }

}