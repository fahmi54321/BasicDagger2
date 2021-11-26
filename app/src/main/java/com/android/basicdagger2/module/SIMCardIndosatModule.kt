package com.android.basicdagger2.module

import com.android.basicdagger2.SIMCardIndosat
import com.android.basicdagger2.interfaces.SIMCard
import dagger.Binds
import dagger.Module

@Module
abstract class SIMCardIndosatModule {
    @Binds
    abstract fun bindsSIMCardIndosat(simCardIndosat: SIMCardIndosat):SIMCard
}