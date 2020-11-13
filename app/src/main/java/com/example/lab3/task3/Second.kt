package com.example.lab3.task3

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.R
import com.example.lab3.databinding.Task22Binding
import com.example.lab3.task2.About

class Second: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Task22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.to1Button.setOnClickListener {
            startActivity(Intent(this, First::class.java).apply {
                flags = FLAG_ACTIVITY_CLEAR_TOP
            })
        }

        binding.to3Button.setOnClickListener {
            startActivity(Intent(this, Third::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        if (item.itemId == R.id.options_menu) {
            startActivity(Intent(this, About::class.java))
        }

        return true
    }
}