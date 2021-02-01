package com.joblena.presentation.components.skill

import android.os.Bundle
import androidx.navigation.NavDirections
import com.joblena.R
import kotlin.Array
import kotlin.Int
import kotlin.String

class PickSkillFragmentDirections private constructor() {
  private data class ActionPickSkillFragmentToPickedSkillFragment(
    val educationSkills: Array<String>,
    val experienceSkills: Array<String>,
    val technicalSkills: Array<String>,
    val softSkills: Array<String>
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_pick_skill_fragment_to_picked_skill_fragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putStringArray("educationSkills", this.educationSkills)
      result.putStringArray("experienceSkills", this.experienceSkills)
      result.putStringArray("technicalSkills", this.technicalSkills)
      result.putStringArray("softSkills", this.softSkills)
      return result
    }
  }

  companion object {
    fun actionPickSkillFragmentToPickedSkillFragment(
      educationSkills: Array<String>,
      experienceSkills: Array<String>,
      technicalSkills: Array<String>,
      softSkills: Array<String>
    ): NavDirections = ActionPickSkillFragmentToPickedSkillFragment(educationSkills,
        experienceSkills, technicalSkills, softSkills)
  }
}
