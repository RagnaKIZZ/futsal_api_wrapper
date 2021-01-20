package com.amd.alloyapiwrapper.demo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.amd.alloyapiwrapper.CallAPI
import com.amd.alloyapiwrapper.utils.Status

class Demo: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        CallAPI.getField().observe(this, Observer { resource ->
            when(resource.status){
                Status.SUCCESS -> {
                    resource.data
                }
            }
        })
    }
}