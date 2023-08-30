package com.learning.core.datastore

import android.util.Log
import androidx.datastore.core.DataStore
import com.learning.core.datastore.model.ActivityLevel
import com.learning.core.datastore.model.Gender
import com.learning.core.datastore.model.GoalType
import com.learning.core.datastore.model.UserPreferences
import java.io.IOException
import javax.inject.Inject

class DefaultUserPreferencesDataSource @Inject constructor(
    private val userPreferences: DataStore<UserPreferencesProto>,
) : UserPreferencesDataSource {
    override suspend fun saveGender(gender: Gender) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.gender = gender.toString()
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveAge(age: Int) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.age = age
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveWeight(weight: Float) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.weight = weight
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveHeight(height: Int) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.height = height
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveActivityLevel(level: ActivityLevel) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.activityLevel = level.toString()
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveGoalType(type: GoalType) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.goalType = type.toString()
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveCarbRatio(ratio: Float) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.carbRatio = ratio
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveProteinRatio(ratio: Float) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.proteinRatio = ratio
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun saveFatRatio(ratio: Float) {
        try {
            userPreferences.updateData { preferences ->
                preferences.copy {
                    this.fatRatio = ratio
                }
            }
        } catch (ioException: IOException) {
            Log.e("CalorieTracker", "Failed to update user preferences", ioException)
        }
    }

    override suspend fun loadUserInfo(): UserPreferences {
        TODO("Not yet implemented")
    }


}