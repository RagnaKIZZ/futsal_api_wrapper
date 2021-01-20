# How to Implement
test api wrapper

- add this to gradle file
implementation 'com.github.RagnaKIZZ:futsal_api_wrapper:1.0'

- add this in activity
{
 CallAPI.getField().observe(this, Observer { resource ->
            when(resource.status){
                Status.SUCCESS -> {
         
                }

                Status.LOADING -> {
                  
                }

                Status.ERROR -> {
                  
                }
            }
        })

}
