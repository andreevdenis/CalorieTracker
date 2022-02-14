package com.plcoding.onboarding_domain.di

import com.plcoding.onboarding_domain.use_case.ValidateNutrients
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OnboardingDomainModule {

    @Provides
    @Singleton
    fun provideValidateNutrientsUseCase(): ValidateNutrients {
        return ValidateNutrients()
    }
}