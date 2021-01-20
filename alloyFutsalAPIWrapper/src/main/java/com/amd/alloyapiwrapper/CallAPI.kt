package com.amd.alloyapiwrapper

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.amd.alloyapiwrapper.utils.Resource
import com.amd.alloyapiwrapper.utils.SchedulerProvider
import com.amd.alloyapiwrapper.wrapper.api.ApiHelper
import com.amd.alloyapiwrapper.wrapper.api.ApiServiceImpl
import com.amd.alloyfutsalapp.model.ModelField
import io.reactivex.disposables.CompositeDisposable

class CallAPI {

    companion object {

        private val apiHelper = ApiHelper(ApiServiceImpl())
        private val compositeDisposable = CompositeDisposable()
        private val schedulerProvider = SchedulerProvider()

        private val modelField = MutableLiveData<Resource<ModelField>>()

        private fun hitField(){
            modelField.postValue(Resource.loading(null))
            compositeDisposable.add(
                apiHelper.getField().compose(schedulerProvider.ioToMainFlowableScheduler())
                    .subscribe ({ resultField ->
                        modelField.postValue(Resource.success(resultField))
                    }, { throwable ->
                        modelField.postValue(Resource.error("something wrong", null))
                })
            )
        }

        fun getField(): LiveData<Resource<ModelField>>{
            hitField()
            return modelField
        }

    }
}