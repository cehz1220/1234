package com.example.myapplication1.data.service

import com.example.myapplication1.data.models.User

/**
 *UserService - interface for fetching data from server
 *
 * fetchUser - function for fetching user by login and password
 *
 * Date Create: 12.12.24
 *
 * @author Arsenii Agafonov
 */
interface UserService {
    /**
     * @param login - user login
     * @param password - user password
     * @return return object user from server
     */
    fun fetchUser(login:String, password:String): User

    class Base(): UserService {
        override fun fetchUser(login: String, password: String): User {
            TODO("Not yet implemented")
        }
    }

}