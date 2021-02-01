package com.joblena.presentation.components.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.joblena.R

class HomeFragmentDirections private constructor() {
  companion object {
    fun actionHomeFragmentIdToPickSkillFragmentId(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_fragment_id_to_pick_skill_fragment_id)
  }
}
