package com.joblena.presentation.components.recuitment_skill
import com.joblena.app.common.Common
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.joblena.R
import com.joblena.databinding.ActivitySkillBinding
import com.joblena.presentation.components.company.CompanyActivity

class SkillActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySkillBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_skill)

        Common.step=0

        //click publish btn
        binding.publishBtn.setOnClickListener {

        }

        //viewPager
        binding.viewpager.setAdapter(SkillPagerAdapter(getSupportFragmentManager()));
        binding.viewpager.setOffscreenPageLimit(2)
        binding.viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
            ) {

            }


            @SuppressLint("NewApi")
            override fun onPageSelected(position: Int) {

                //check bottom buttons visibility
                if (position == 3) {
                    binding.publishBtn.visibility = View.VISIBLE;
                    binding.nextBtn.visibility = View.INVISIBLE
                    binding.previousBtn.visibility = View.INVISIBLE
                } else {
                    binding.publishBtn.visibility = View.INVISIBLE;
                    binding.nextBtn.visibility = View.VISIBLE
                    binding.previousBtn.visibility = View.VISIBLE
                }

                //at position one
                if (position == 0) {
                    binding.techincalBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.DKGRAY)
                    }
                } else {
                    binding.techincalBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.parseColor("#4285f4"))
                    }
                }
                //at position two
                if (position == 1) {
                    binding.softskillsBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.DKGRAY)
                    }
                } else {
                    binding.softskillsBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.parseColor("#4285f4"))
                    }
                }
                //at position three
                if (position == 2) {
                    binding.languageBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.DKGRAY)
                    }
                } else {
                    binding.languageBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.parseColor("#4285f4"))
                    }
                }
                //at position four
                if (position == 3) {
                    binding.preferencesBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.DKGRAY)
                    }
                } else {
                    binding.preferencesBtn.apply {
                        backgroundTintList = ColorStateList.valueOf(Color.parseColor("#4285f4"))
                    }

                }
            }

        })

        //click next button
        binding.nextBtn.setOnClickListener {
            if (Common.step < 3 && Common.step >= 0) {
                Common.step++
                binding.viewpager.setCurrentItem(Common.step)
            }
        }

        //click back button
        binding.previousBtn.setOnClickListener {
            if (Common.step <=3 && Common.step > 0) {
                Common.step--
                binding.viewpager.setCurrentItem(Common.step)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Common.step=0
    }

    override fun onRestart() {
        super.onRestart()
        Common.step=0
    }

    override fun onResume() {
        super.onResume()
        Common.step=0
    }
}