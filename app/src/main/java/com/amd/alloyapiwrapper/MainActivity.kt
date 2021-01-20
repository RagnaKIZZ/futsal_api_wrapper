package com.amd.alloyapiwrapper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import com.amd.alloyfutsalapiwrapper.CallAPI
import com.amd.alloyfutsalapiwrapper.utils.Status
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CallAPI.getField().observe(this, Observer { resource ->
            when(resource.status){
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, resource.data!!.meta.msg, Toast.LENGTH_LONG).show()
                    txtName.text = resource.data!!.data[0].nameField
                }

                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                }

                Status.ERROR -> {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, resource.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}