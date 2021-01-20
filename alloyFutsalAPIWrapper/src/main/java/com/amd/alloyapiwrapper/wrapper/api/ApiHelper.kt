package com.amd.alloyapiwrapper.wrapper.api

class ApiHelper(private val apiService: ApiService) {

    fun getField() = apiService.getField()

}