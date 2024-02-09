package com.example.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /*    @Inject
        lateinit var userRepository: UserRepository*/


    //each time it creating a new object
    @Inject
    lateinit var loggerService1: LoggerService

    @Inject
    lateinit var loggerService2: LoggerService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        userRepository.saveUser("test@gmail.com","89765")
    }
}