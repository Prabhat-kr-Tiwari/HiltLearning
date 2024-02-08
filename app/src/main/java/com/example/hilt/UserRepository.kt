package com.example.hilt

import android.util.Log
import com.example.hilt.SQLRepository.Companion.TAG
import javax.inject.Inject



interface UserRepository{
    fun saveUser(email: String,password: String)
}
class SQLRepository
@Inject
constructor():UserRepository
{

    override fun saveUser(email:String,password:String){
        Log.d(TAG, "User saved in db")
    }
    companion object{
        const val TAG="UserRepository"
    }
}
class FirebaseRepository:UserRepository{
    override fun saveUser(email: String, password: String) {

        Log.d(TAG, "User saved in firebase")
    }

}
