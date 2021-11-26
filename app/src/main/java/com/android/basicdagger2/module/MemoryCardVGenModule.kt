package com.android.basicdagger2.module

import com.android.basicdagger2.MemoryCardVGen
import com.android.basicdagger2.interfaces.MemoryCard
import dagger.Binds
import dagger.Module

@Module
abstract class MemoryCardVGenModule {

    @Binds
    abstract fun bindsMemoryCardVGen(memoryCardVGen: MemoryCardVGen):MemoryCard

}