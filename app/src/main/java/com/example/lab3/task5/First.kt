package com.example.lab3.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lab3.R
import com.example.lab3.databinding.Task51Binding

class First: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Task51Binding.inflate(layoutInflater)
        binding.toSecond1.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_first_to_second)
        }

        return binding.root
    }
}