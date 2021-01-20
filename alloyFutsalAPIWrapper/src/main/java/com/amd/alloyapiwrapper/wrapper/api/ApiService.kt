package com.amd.alloyapiwrapper.wrapper.api

import com.amd.alloyfutsalapp.model.ModelField
import io.reactivex.Flowable

interface ApiService {

    fun getField(): Flowable<ModelField>

}