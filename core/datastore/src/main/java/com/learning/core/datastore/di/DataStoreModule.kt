package com.learning.core.datastore.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.dataStoreFile
import com.learning.core.datastore.UserPreferencesProto
import com.learning.core.datastore.UserPreferencesSerializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun provideDataStoreModule(
        @ApplicationContext context: Context,
    ): DataStore<UserPreferencesProto> =
        DataStoreFactory.create(
            serializer = UserPreferencesSerializer,
        ) {
            context.dataStoreFile("user_preferences.pb")
        }
}

