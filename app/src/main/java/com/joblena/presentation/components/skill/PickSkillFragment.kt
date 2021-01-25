package com.joblena.presentation.components.skill

import android.os.Bundle
import android.util.ArrayMap
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.viewpager.widget.PagerAdapter
import com.google.android.flexbox.FlexboxLayout
import com.joblena.R
import com.joblena.databinding.FragmentPickSkillBinding
import com.joblena.domain.entities.SkillCategory
import kotlinx.android.synthetic.main.fragment_pick_skill.*

class PickSkillFragment : Fragment() {
    private var pickedSkills: ArrayMap<String, ArrayList<String>> = ArrayMap()
    private var textViews: ArrayList<TextView> = ArrayList()
    private var educationSkills: Array<String> = arrayOf("")
    private var experienceSkills: Array<String> = arrayOf("")
    private var technicalSkills: Array<String> = arrayOf("")
    private var softSkills: Array<String> = arrayOf("")

    private lateinit var binding: FragmentPickSkillBinding
    var mAdapter: SkillsPagerAdapter? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPickSkillBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mAdapter = SkillsPagerAdapter()
        skills_vp_id.offscreenPageLimit = 4
        skills_vp_id.adapter = mAdapter
        mAdapter!!.notifyDataSetChanged()
        skills_tl_id!!.setupWithViewPager(skills_vp_id)

        next_tv_id.setOnClickListener {
            val directions = PickSkillFragmentDirections.actionPickSkillFragmentToPickedSkillFragment(educationSkills,
                    experienceSkills, technicalSkills, softSkills)
            findNavController(requireActivity(), R.id.nav_host_fragment_id).navigate(directions)

        }

        refresh_iv_id.setOnClickListener {
            for (tv in textViews) {
                tv.tag = "unselected"
                tv.setBackgroundResource(R.drawable.chip_unselected)
                tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
            }
            pickedSkills.clear()
            educationSkills = arrayOf("")
            experienceSkills = arrayOf("")
            technicalSkills = arrayOf("")
            softSkills = arrayOf("")
        }
    }

    inner class SkillsPagerAdapter : PagerAdapter() {
        override fun instantiateItem(collection: ViewGroup, position: Int): Any {
            val inflater = LayoutInflater.from(context)
            val layout = inflater.inflate(R.layout.layout_chips_container, collection, false) as ViewGroup
            val flexboxLayout: FlexboxLayout = layout.findViewById<View>(R.id.flex_layout_id) as FlexboxLayout
            when (position) {
                0 -> inflateLayoutWithFilters("education", flexboxLayout)
                1 -> inflateLayoutWithFilters("experience", flexboxLayout)
                2 -> inflateLayoutWithFilters("technical", flexboxLayout)
                3 -> inflateLayoutWithFilters("soft", flexboxLayout)
            }
            collection.addView(layout)
            return layout
        }

        override fun getPageTitle(position: Int): CharSequence {
            when (position) {
                0 -> return "Education"
                1 -> return "Experience"
                2 -> return "Technical"
                3 -> return "Soft"
            }
            return ""
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return view === `object`
        }

        override fun getCount(): Int {
            return 4
        }
    }

    private fun inflateLayoutWithFilters(category: String, flexboxLayout: FlexboxLayout) {
        var childs: List<String> = ArrayList()
        when (category) {
            "education" -> childs = SkillData.getSkillTitles(SkillCategory.EDUCATION)!!
            "experience" -> childs = SkillData.getSkillTitles(SkillCategory.EXPERIENCE)!!
            "technical" -> childs = SkillData.getSkillTitles(SkillCategory.TECHNICAL)!!
            "soft" -> childs = SkillData.getSkillTitles(SkillCategory.SOFT)!!
        }
        for (i in childs.indices) {
            val subchild: View = requireActivity().layoutInflater.inflate(R.layout.item_chip, null)
            val textView = subchild.findViewById<View>(R.id.skill_title_id) as TextView
            textView.text = childs[i]
            textView.setOnClickListener {
                if (textView.tag != null && textView.tag == "selected") {
                    textView.tag = "unselected"
                    textView.setBackgroundResource(R.drawable.chip_unselected)
                    textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                    removeFromSelectedMap(category, childs[i])
                    subSkills()
                } else {
                    textView.tag = "selected"
                    textView.setBackgroundResource(R.drawable.chip_selected)
                    textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                    addToSelectedMap(category, childs[i])
                    subSkills()
                }
            }

            if (pickedSkills[category] != null && pickedSkills[category]!!.contains(childs[i])) {
                textView.tag = "selected"
                textView.setBackgroundResource(R.drawable.chip_selected)
                textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            } else {
                textView.tag = "unselected"
                textView.setBackgroundResource(R.drawable.chip_unselected)
                textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
            }
            textViews.add(textView)
            flexboxLayout.addView(subchild)
        }
    }

    private fun subSkills() {
        if (pickedSkills["education"] != null) {
            educationSkills = pickedSkills["education"]!!.toTypedArray()
        }
        if (pickedSkills["experience"] != null) {
            experienceSkills = pickedSkills["experience"]!!.toTypedArray()
        }
        if (pickedSkills["technical"] != null) {
            technicalSkills = pickedSkills["technical"]!!.toTypedArray()
        }
        if (pickedSkills["soft"] != null) {
            softSkills = pickedSkills["soft"]!!.toTypedArray()
        }
    }

    private fun addToSelectedMap(category: String, child: String) {
        if (pickedSkills[category] != null && !pickedSkills[category]?.contains(child)!!) {
            pickedSkills[category]!!.add(child)
        } else {
            val temp: ArrayList<String> = ArrayList()
            temp.add(child)
            pickedSkills[category] = temp
        }
    }

    private fun removeFromSelectedMap(category: String, child: String) {
        if (pickedSkills[category]!!.size == 1) {
            pickedSkills.remove(category)
        } else {
            pickedSkills[category]!!.remove(child)
        }
    }


}
