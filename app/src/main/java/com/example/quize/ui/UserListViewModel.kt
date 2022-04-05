package com.example.quize.ui

import androidx.lifecycle.ViewModel

class UserListViewModel:ViewModel() {
    private lateinit var _userList
    val userList
    get() = _userList
}