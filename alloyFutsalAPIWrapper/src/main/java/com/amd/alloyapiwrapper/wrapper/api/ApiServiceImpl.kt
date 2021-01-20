package com.amd.alloyapiwrapper.wrapper.api

import com.amd.alloyfutsalapp.model.ModelField
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Flowable

class ApiServiceImpl : ApiService {
    override fun getField(): Flowable<ModelField> {
        return Rx2AndroidNetworking.get("https://alloyfutsall.000webhostapp.com/field")
            .build()
            .getObjectFlowable(ModelField::class.java)
    }

    override fun searchField(name: String?): Flowable<ModelField> {
        return Rx2AndroidNetworking.get("https://alloyfutsall.000webhostapp.com/field")
            .addQueryParameter("name", name)
            .build()
            .getObjectFlowable(ModelField::class.java)
    }

}