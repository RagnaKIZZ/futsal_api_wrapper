package com.amd.alloyfutsalapiwrapper.wrapper.repository

import com.amd.alloyfutsalapiwrapper.wrapper.api.ApiHelper
import com.amd.alloyfutsalapp.model.ModelField
import io.reactivex.Flowable
import java.lang.Exception

class MainRepository(private val apiHelper: ApiHelper) {

    fun getField(): Flowable<ModelField> {
        return apiHelper.getField()
    }

}