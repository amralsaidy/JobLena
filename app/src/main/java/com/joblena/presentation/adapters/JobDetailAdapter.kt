package com.joblena.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.joblena.databinding.JobItemListBinding
import com.joblena.domain.entities.JobDetail
import java.util.*


class JobDetailAdapter(private  var jobDetails: ArrayList<JobDetail>) : ListAdapter<JobDetail, JobDetailAdapter.viewHolder>(DiffCallback) {


    class viewHolder (private  var binding : JobItemListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item : JobDetail){
            binding.jobdetail=item
            binding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(JobItemListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        var item = jobDetails.get(position)
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return jobDetails.size
    }

    companion object DiffCallback : DiffUtil.ItemCallback<JobDetail>() {
        override fun areItemsTheSame(oldItem: JobDetail, newItem: JobDetail): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: JobDetail, newItem: JobDetail): Boolean {
            return oldItem.name == newItem.name
        }
    }

}