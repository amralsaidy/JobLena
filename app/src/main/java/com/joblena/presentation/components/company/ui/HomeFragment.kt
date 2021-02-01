package com.joblena.presentation.components.company.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.joblena.R
import com.joblena.app.common.Event
import com.joblena.databinding.FragmentHome2Binding
import com.joblena.domain.entities.JobDetail
import com.joblena.domain.entities.JobName
import com.joblena.presentation.adapters.JobDetailAdapter
import com.joblena.presentation.adapters.JobNameAdapter
import com.joblena.presentation.components.recuitment_job.JobActivity
import org.greenrobot.eventbus.EventBus


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHome2Binding

        override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?,
                savedInstanceState: Bundle?
        ): View? {

            binding=  FragmentHome2Binding.inflate(inflater, container, false)

             binding.menuImage.setOnClickListener {
                EventBus.getDefault().postSticky(Event(true))
            }

            //just temprary unitl fetch apis
            var arraylist = ArrayList<JobName>()
            arraylist.add(JobName("product manger"));
            arraylist.add(JobName("Android developer"));
            arraylist.add(JobName("graphic designer"));
            arraylist.add(JobName("accountant"));
            arraylist.add(JobName("backend developer"));
            binding.jobsRecyclerview.adapter= JobNameAdapter(arraylist);
            binding.jobsRecyclerview.isHorizontalFadingEdgeEnabled=true


            //just temprary unitl fetch apis
            var arraylist2 = ArrayList<JobDetail>()
            arraylist2.add(JobDetail("product manger"));
            arraylist2.add(JobDetail("Android developer"));
            arraylist2.add(JobDetail("graphic designer"));
            arraylist2.add(JobDetail("accountant"));
            arraylist2.add(JobDetail("backend developer"));
            binding.jobsLists.adapter= JobDetailAdapter(arraylist2);


            binding.layoutCreateJob.setOnClickListener {
                startActivity(Intent((activity as AppCompatActivity) ,JobActivity::class.java ))
            }

            return binding.root
        }



    }
