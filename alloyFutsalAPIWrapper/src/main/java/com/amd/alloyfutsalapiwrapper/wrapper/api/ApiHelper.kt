package com.amd.alloyfutsalapiwrapper.wrapper.api

class ApiHelper(private val apiService: ApiService) {

    fun getField() = apiService.getField()

}