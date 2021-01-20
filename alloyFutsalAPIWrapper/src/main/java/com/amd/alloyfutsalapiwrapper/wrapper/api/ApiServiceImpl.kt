package com.amd.alloyfutsalapiwrapper.wrapper.api

import com.amd.alloyfutsalapp.model.ModelField
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Flowable

class ApiServiceImpl : ApiService {
    override fun getField(): Flowable<ModelField> {
        return Rx2AndroidNetworking.get("https://alloyfutsall.000webhostapp.com/field")
            .build()
            .getObjectFlowable(ModelField::class.java)
    }

}