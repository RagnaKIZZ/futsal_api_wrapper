package com.amd.alloyfutsalapiwrapper

import android.app.Application
import com.androidnetworking.AndroidNetworking

class MyWrapper : Application() {

    override fun onCreate() {
        super.onCreate()

        AndroidNetworking.initialize(this)

    }

}