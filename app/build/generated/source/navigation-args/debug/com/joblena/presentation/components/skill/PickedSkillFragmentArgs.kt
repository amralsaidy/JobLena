package com.joblena.presentation.components.skill

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.jvm.JvmStatic

data class PickedSkillFragmentArgs(
  val educationSkills: Array<String>,
  val experienceSkills: Array<String>,
  val technicalSkills: Array<String>,
  val softSkills: Array<String>
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putStringArray("educationSkills", this.educationSkills)
    result.putStringArray("experienceSkills", this.experienceSkills)
    result.putStringArray("technicalSkills", this.technicalSkills)
    result.putStringArray("softSkills", this.softSkills)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): PickedSkillFragmentArgs {
      bundle.setClassLoader(PickedSkillFragmentArgs::class.java.classLoader)
      val __educationSkills : Array<String>?
      if (bundle.containsKey("educationSkills")) {
        __educationSkills = bundle.getStringArray("educationSkills")
        if (__educationSkills == null) {
          throw IllegalArgumentException("Argument \"educationSkills\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"educationSkills\" is missing and does not have an android:defaultValue")
      }
      val __experienceSkills : Array<String>?
      if (bundle.containsKey("experienceSkills")) {
        __experienceSkills = bundle.getStringArray("experienceSkills")
        if (__experienceSkills == null) {
          throw IllegalArgumentException("Argument \"experienceSkills\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"experienceSkills\" is missing and does not have an android:defaultValue")
      }
      val __technicalSkills : Array<String>?
      if (bundle.containsKey("technicalSkills")) {
        __technicalSkills = bundle.getStringArray("technicalSkills")
        if (__technicalSkills == null) {
          throw IllegalArgumentException("Argument \"technicalSkills\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"technicalSkills\" is missing and does not have an android:defaultValue")
      }
      val __softSkills : Array<String>?
      if (bundle.containsKey("softSkills")) {
        __softSkills = bundle.getStringArray("softSkills")
        if (__softSkills == null) {
          throw IllegalArgumentException("Argument \"softSkills\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"softSkills\" is missing and does not have an android:defaultValue")
      }
      return PickedSkillFragmentArgs(__educationSkills, __experienceSkills, __technicalSkills,
          __softSkills)
    }
  }
}
