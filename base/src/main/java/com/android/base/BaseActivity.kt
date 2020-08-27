package com.android.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.HasAndroidInjector

abstract class BaseActivity<B: ViewDataBinding> : AppCompatActivity(), HasAndroidInjector {

    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutId())
    }

    abstract fun getLayoutId(): Int
}