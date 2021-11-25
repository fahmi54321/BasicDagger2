package com.android.basicdagger2.module

import com.android.basicdagger2.SIMCard
import com.android.basicdagger2.ServiceProvider
import dagger.Module
import dagger.Provides

@Module
class SIMCardModule {

    @Provides
    fun providesSIMCard(serviceProvider: ServiceProvider):SIMCard{
        return SIMCard(serviceProvider)
    }

}