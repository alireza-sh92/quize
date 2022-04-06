package com.example.quize.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quize.datamodel.UsersList
import com.example.quize.network.MaktabApi
import kotlinx.coroutines.launch

class UserListViewModel : ViewModel() {

    private var _userList: MutableLiveData<UsersList> = MutableLiveData()
    val userList: LiveData<UsersList>
        get() = _userList

    fun getUserList() {
        viewModelScope.launch {
            try {
                val listResult = MaktabApi.Service.getUserList()
                _userList.value = listResult
            } catch (e: Exception) {
                _userList.value = "Failure: ${e.message}" as UsersList
            }
        }
    }
}