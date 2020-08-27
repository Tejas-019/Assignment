package com.android.assignment.dagger

import com.readystatesoftware.chuck.internal.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AppBindingModule {
    @ContributesAndroidInjector
    fun bindMainActivity(): MainActivity
}