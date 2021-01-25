package com.joblena.presentation.components.skill

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.joblena.R
import com.joblena.databinding.ItemSkillBinding

class SkillAdapter : RecyclerView.Adapter<SkillAdapter.SkillViewHolder>() {
    private val skillList: ArrayList<String> = ArrayList()
    private lateinit var skillBinding: ItemSkillBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        skillBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.item_skill,
                parent,
                false
        )
        return SkillViewHolder(skillBinding)
    }

    override fun getItemCount(): Int {
        return skillList.size
    }

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        holder.bind(skillList[position])
    }

    fun updateSkill(childs: List<String>) {
        skillList.clear()
        skillList.addAll(childs)
        notifyDataSetChanged()
    }


    inner class SkillViewHolder(val binding: ItemSkillBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {
            binding.apply {
                binding.titleTvId.text = title
            }
        }
    }
}