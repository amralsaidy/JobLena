package com.joblena.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.joblena.databinding.SkillListItemBinding
import com.joblena.domain.entities.SkillChoose
import java.util.*


class SkillsAdapter(private  var skills: ArrayList<SkillChoose>) : ListAdapter<SkillChoose, SkillsAdapter.viewHolder>(DiffCallback) {


    class viewHolder (private  var binding : SkillListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item : SkillChoose){
            binding.skill=item
            binding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(SkillListItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        var item = skills.get(position)
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return skills.size
    }

    companion object DiffCallback : DiffUtil.ItemCallback<SkillChoose>() {
        override fun areItemsTheSame(oldItem: SkillChoose, newItem: SkillChoose): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: SkillChoose, newItem: SkillChoose): Boolean {
            return oldItem.name == newItem.name
        }
    }

}