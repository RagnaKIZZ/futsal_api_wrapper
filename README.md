# How to Implement
test api wrapper

- add this to gradle file
implementation 'com.github.RagnaKIZZ:futsal_api_wrapper:1.0'

- add this in activity

 CallAPI.getField().observe(this, Observer { resource ->
            when(resource.status){
                Status.SUCCESS -> {
                    progressBar.visibility = GONE
                    Toast.makeText(this, resource.data!!.meta.msg, Toast.LENGTH_LONG).show()
                    txtName.text = resource.data!!.data[0].nameField
                }

                Status.LOADING -> {
                    progressBar.visibility = VISIBLE
                }

                Status.ERROR -> {
                    progressBar.visibility = GONE
                    Toast.makeText(this, resource.message, Toast.LENGTH_LONG).show()
                }
            }
        })
