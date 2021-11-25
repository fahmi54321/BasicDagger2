package com.android.basicdagger2

import dagger.Module
import dagger.Provides

// todo 2 (next tambahkan module pada Component)
@Module
class MemoryCardModule {

    @Provides
    fun providesMemoyCard():MemoryCard{
        return MemoryCard()
    }

}