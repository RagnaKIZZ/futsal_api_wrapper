package com.amd.alloyapiwrapper.wrapper.api

import com.amd.alloyfutsalapp.model.ModelField

class ApiHelper(private val apiService: ApiService) {

    fun getField() = apiService.getField()

    fun searchField(name: String?) = apiService.searchField(name)

    var onSuccess: ((ModelField) -> Unit)? = null
    var onLoading: (() -> Unit)? = null
    var onFailed: ((msg: String) -> Unit)? = null


}