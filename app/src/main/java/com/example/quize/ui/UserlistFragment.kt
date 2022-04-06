package com.example.quize.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.quize.R

class UserlistFragment : Fragment(R.layout.fragment_userlist) {
    private val viewModel: UserListViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv: TextView = view.findViewById(R.id.example)
        val button: Button = view.findViewById(R.id.fetch_button)
        viewModel.getUserList()
        button.setOnClickListener {
            tv.text = viewModel.userList.value.toString()
        }

    }
}