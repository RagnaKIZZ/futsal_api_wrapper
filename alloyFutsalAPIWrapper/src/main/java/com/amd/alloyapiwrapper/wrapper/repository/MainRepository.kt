package com.amd.alloyapiwrapper.wrapper.repository

import com.amd.alloyapiwrapper.wrapper.api.ApiHelper
import com.amd.alloyfutsalapp.model.ModelField
import io.reactivex.Flowable

class MainRepository(private val apiHelper: ApiHelper) {

    fun getField(): Flowable<ModelField> {
        return apiHelper.getField()
    }

}