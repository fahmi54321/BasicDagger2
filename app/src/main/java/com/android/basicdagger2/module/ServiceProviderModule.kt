package com.android.basicdagger2.module

import com.android.basicdagger2.ServiceProvider
import dagger.Module
import dagger.Provides

@Module
class ServiceProviderModule {

    @Provides
    fun providesServiceProvider():ServiceProvider{
        return ServiceProvider()
    }

}