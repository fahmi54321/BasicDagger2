package com.android.basicdagger2.module

import com.android.basicdagger2.SIMCardIndosat
import com.android.basicdagger2.interfaces.SIMCard
import dagger.Module
import dagger.Provides

@Module
class SIMCardIndosatModule {

    @Provides
    fun providesSimCardIndosat(simCardIndosat: SIMCardIndosat):SIMCard{
        return simCardIndosat
    }

}