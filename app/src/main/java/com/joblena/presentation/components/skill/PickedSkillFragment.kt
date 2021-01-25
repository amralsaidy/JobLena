package com.joblena.presentation.components.skill

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.joblena.databinding.FragmentPickedSkillBinding
import kotlinx.android.synthetic.main.fragment_picked_skill.*

class PickedSkillFragment:Fragment() {
    private val args: PickedSkillFragmentArgs by navArgs()
    private lateinit var binding: FragmentPickedSkillBinding
    private val educationSkillAdapter = SkillAdapter()
    private val experienceSkillAdapter = SkillAdapter()
    private val technicalSkillAdapter = SkillAdapter()
    private val softSkillAdapter = SkillAdapter()
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPickedSkillBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        educationSkillAdapter.updateSkill(args.educationSkills.asList().sorted())
        experienceSkillAdapter.updateSkill(args.experienceSkills.asList().sorted())
        technicalSkillAdapter.updateSkill(args.technicalSkills.asList().sorted())
        softSkillAdapter.updateSkill(args.softSkills.asList().sorted())
        education_skills_rv_id.adapter = educationSkillAdapter
        experience_skills_rv_id.adapter = experienceSkillAdapter
        technical_skills_rv_id.adapter = technicalSkillAdapter
        soft_skills_rv_id.adapter = softSkillAdapter

        back_iv_id.setOnClickListener {
            findNavController(view).popBackStack()
        }
    }

}