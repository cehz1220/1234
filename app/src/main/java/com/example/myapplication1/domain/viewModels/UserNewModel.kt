package com.example.myapplication1.domain.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication1.data.models.User

class UserNewModel : ViewModel() {
    private var _user: MutableLiveData<User> = MutableLiveData()
    val user: LiveData<User> = _user;
    fun authorization() {
        TODO("Not yet implemented")
    }

    fun logOut() {
        TODO("Not yet implemented")
    }
}