package com.example.hilt

import android.util.Log
import javax.inject.Inject

class UserRepository
@Inject
constructor(val loggerService: LoggerService)
{


    fun saveUser(email:String,password:String){
        loggerService.log( "saveUser in local db")
    }
    companion object{
        const val TAG="UserRepository"
    }
}
