package com.learning.core.datastore

import com.learning.core.datastore.model.ActivityLevel
import com.learning.core.datastore.model.Gender
import com.learning.core.datastore.model.GoalType
import com.learning.core.datastore.model.UserPreferences

interface UserPreferencesDataSource {
    suspend fun saveGender(gender: Gender)
    suspend fun saveAge(age: Int)
    suspend fun saveWeight(weight: Float)
    suspend fun saveHeight(height: Int)
    suspend fun saveActivityLevel(level: ActivityLevel)
    suspend fun saveGoalType(type: GoalType)
    suspend fun saveCarbRatio(ratio: Float)
    suspend fun saveProteinRatio(ratio: Float)
    suspend fun saveFatRatio(ratio: Float)

    suspend fun loadUserInfo(): UserPreferences


}
