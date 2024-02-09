package com.example.hilt

import android.util.Log
import com.example.hilt.SQLRepository.Companion.TAG

import javax.inject.Inject
import javax.inject.Singleton


//this will create a single instance of class
@Singleton
class LoggerService
@Inject
constructor()
{

    fun log(message:String){
        Log.d(TAG, message)
    }
}
