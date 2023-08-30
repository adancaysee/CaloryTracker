package com.learning.core.datastore.model

data class UserPreferences(
    val gender: Gender,
    val age: Int,
    val weight: Float,
    val height: Int,
    val activityLevel: ActivityLevel,
    val goalType: GoalType,
    val carbRatio: Float,
    val proteinRatio: Float,
    val fatRatio: Float
)

enum class ActivityLevel {
    LOW, MEDIUM, HIGH;

    override fun toString(): String {
        return name.lowercase()
    }
}

enum class Gender {
    MALE, FEMALE;

    override fun toString(): String {
        return name.lowercase()
    }
}

enum class GoalType {
    LOSE_WEIGHT, KEEP_WEIGHT, GAIN_WEIGHT;

    override fun toString(): String {
        return name.lowercase()
    }
}