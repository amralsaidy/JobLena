package com.joblena.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.joblena.databinding.JobNameListItemBinding
import com.joblena.domain.entities.JobName
import java.util.*

class JobNameAdapter(private  var jobnames: ArrayList<JobName>) : ListAdapter<JobName, JobNameAdapter.viewHolder>(DiffCallback) {


    class viewHolder (private  var binding : JobNameListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item : JobName){
            binding.jobname=item
            binding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(JobNameListItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        var item = jobnames.get(position)
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return jobnames.size
    }

    companion object DiffCallback : DiffUtil.ItemCallback<JobName>() {
        override fun areItemsTheSame(oldItem: JobName, newItem: JobName): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: JobName, newItem: JobName): Boolean {
            return oldItem.name == newItem.name
        }
    }

}