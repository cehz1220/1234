package com.example.myapplication1.domain.repository


interface UserRepository {
        fun authorization()
        fun logOut()
        class Base(): UserRepository{
            override fun authorization() {
                TODO("Not yet implemented")
            }

            override fun logOut() {
                TODO("Not yet implemented")
            }

        }

}