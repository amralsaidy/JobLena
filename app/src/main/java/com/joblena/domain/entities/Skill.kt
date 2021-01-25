package com.joblena.domain.entities

data class Skill (
        val id:Int,
        val title:String,
        val category: SkillCategory
)

// Education, Experience, Technical, Soft
enum class SkillCategory {
    EDUCATION, EXPERIENCE, TECHNICAL, SOFT
}

