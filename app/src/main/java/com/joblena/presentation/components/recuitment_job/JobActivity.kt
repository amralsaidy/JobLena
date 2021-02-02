package com.joblena.presentation.components.recuitment_job

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.joblena.app.common.Common
import com.joblena.R
import com.joblena.databinding.ActivityJobBinding
import com.joblena.presentation.components.recuitment_skill.SkillActivity

class JobActivity : AppCompatActivity() {

    private lateinit var binding : ActivityJobBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this, R.layout.activity_job)

        //viewPager
        binding.viewpager.setAdapter(JobPagerAdapter(getSupportFragmentManager()));
        binding.viewpager.setOffscreenPageLimit(2)
        binding.viewpager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onPageSelected(position: Int) {

                //at position one
                if(position==0){
                    binding.jobDescBtn.apply {
                        backgroundTintList= ColorStateList.valueOf(Color.DKGRAY)
                    }
                }else{
                    binding.jobDescBtn.apply {
                        backgroundTintList= ColorStateList.valueOf(Color.parseColor("#4285f4"))

                    }
                }
                //at position two
                if(position==1){
                    binding.jobSpecificationBtn.apply {
                        backgroundTintList= ColorStateList.valueOf(Color.DKGRAY)
                    }
                }else{
                    binding.jobSpecificationBtn.apply {
                        backgroundTintList= ColorStateList.valueOf(Color.parseColor("#4285f4"))

                    } } }
        })

        //click next button
        binding.nextBtn.setOnClickListener {
            if (Common.next==0) {
                Common.next++
                binding.viewpager.setCurrentItem(Common.next)
                Common.firstClick=true
            }
            if(Common.next==1){
                startActivity(Intent(this , SkillActivity::class.java))
            }
        }

        //click next button
      /*  binding.nextBtn.setOnClickListener {
            if (Common.next==1 && Common.firstClick==true){
                startActivity(Intent(this , SkillActivity::class.java))
                Common.firstClick=false
            } }*/

        //click back button
        binding.previousBtn.setOnClickListener {
            if (Common.next <=1 && Common.next > 0) {
                Common.next--
                binding.viewpager.setCurrentItem(Common.next)
            }
        }
    }
}