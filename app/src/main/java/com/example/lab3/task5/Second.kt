package com.example.lab3.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lab3.R
import com.example.lab3.databinding.Task52Binding

class Second: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Task52Binding.inflate(layoutInflater)
        binding.toThird1.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_second_to_third)
        }

        binding.toForth1.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_second_to_forth)
        }

        return binding.root
    }
}