package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named


@InstallIn(SingletonComponent::class)
@Module
abstract class UserModule {

    /*  @Provides
      fun provideUserRepository():UserRepository{
          return FirebaseRepository()

      }*/
    /*   @Provides
       fun provideUserRepository(sqlRepository: SQLRepository): UserRepository {
           return sqlRepository
       }*/
    /*    @Binds
        abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository*/


    //qualifiers
    @Provides
    @Named("sql")
    fun provideUserRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Provides
//    @Named("firebase")
    @FirebaseQualifier
    fun provideFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

}