package com.joblena.presentation.components.skill

import com.joblena.domain.entities.Skill
import com.joblena.domain.entities.SkillCategory
import java.util.*

class SkillData() {

    companion object {
        fun getSkillTitles(category: SkillCategory): List<String>? {
            val titles: MutableList<String> = ArrayList()
            for (skill in getSkills()) {
                if (!titles.contains(skill.title) && skill.category == category) {
                    titles.add(skill.title)
                }
            }
            titles.sort()
            return titles
        }


        private fun getSkills(): ArrayList<Skill> {
            val mList: ArrayList<Skill> = ArrayList()
            mList.add(Skill(101, "Major Science", SkillCategory.EDUCATION))
            mList.add(Skill(102, "BS in Computer Engineering", SkillCategory.EDUCATION))
            mList.add(Skill(103, "BA in Economics", SkillCategory.EDUCATION))
            mList.add(Skill(104, "BS in Business Administration", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BA in Sociology", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BA in Communications", SkillCategory.EDUCATION))
            mList.add(Skill(105, "B.B.A. in Accounting", SkillCategory.EDUCATION))
            mList.add(Skill(105, "M.A. in Journalism", SkillCategory.EDUCATION))
            mList.add(Skill(105, "A.A.S., Business-Marketing", SkillCategory.EDUCATION))
            mList.add(Skill(105, "Bachelor of Arts in Psychology", SkillCategory.EDUCATION))
            mList.add(Skill(105, "Master’s of Business Administration", SkillCategory.EDUCATION))
            mList.add(Skill(105, "Master’s of Science", SkillCategory.EDUCATION))
            mList.add(Skill(105, "B.A. in Accounting candidate", SkillCategory.EDUCATION))
            mList.add(Skill(105, "Johnson Academic Achievement", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BSc Computing", SkillCategory.EDUCATION))
            mList.add(Skill(105, "High School Equivalency Diploma", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BS in Electrical Engineering", SkillCategory.EDUCATION))
            mList.add(Skill(105, "Bachelor of Arts in English", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BS in Mathematics in Progress", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BS in Economics", SkillCategory.EDUCATION))
            mList.add(Skill(105, "MS in Computer Science", SkillCategory.EDUCATION))
            mList.add(Skill(105, "Master of Science in Economics", SkillCategory.EDUCATION))
            mList.add(Skill(105, "MS in Biology", SkillCategory.EDUCATION))
            mList.add(Skill(105, "BS in Biomedical Engineering", SkillCategory.EDUCATION))
            mList.add(Skill(301, "experience1", SkillCategory.EXPERIENCE))
            mList.add(Skill(302, "experience2", SkillCategory.EXPERIENCE))
            mList.add(Skill(303, "ِexperience3", SkillCategory.EXPERIENCE))
            mList.add(Skill(304, "experience4", SkillCategory.EXPERIENCE))
            mList.add(Skill(305, "experience5", SkillCategory.EXPERIENCE))
            mList.add(Skill(501, "ِtechnical1", SkillCategory.TECHNICAL))
            mList.add(Skill(502, "ِtechnical2", SkillCategory.TECHNICAL))
            mList.add(Skill(503, "ِtechnical3", SkillCategory.TECHNICAL))
            mList.add(Skill(504, "ِtechnical4", SkillCategory.TECHNICAL))
            mList.add(Skill(505, "ِtechnical5", SkillCategory.TECHNICAL))
            mList.add(Skill(701, "soft1", SkillCategory.SOFT))
            mList.add(Skill(702, "soft2", SkillCategory.SOFT))
            mList.add(Skill(703, "soft3", SkillCategory.SOFT))
            mList.add(Skill(704, "soft4", SkillCategory.SOFT))
            mList.add(Skill(705, "soft5", SkillCategory.SOFT))
            return mList
        }
    }

}