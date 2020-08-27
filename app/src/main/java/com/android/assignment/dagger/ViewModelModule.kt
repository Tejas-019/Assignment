package com.android.assignment.dagger

import androidx.lifecycle.ViewModelProvider
import com.android.common.dagger.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory?): ViewModelProvider.Factory?
}