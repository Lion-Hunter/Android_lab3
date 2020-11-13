package com.example.lab3.task4

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.R
import com.example.lab3.databinding.Task42Binding
import com.example.lab3.task2.About

class Second: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Task42Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toThird.setOnClickListener {
            startActivity(Intent(this, Third::class.java))
        }

        binding.toForth.setOnClickListener {
            startActivity(Intent(this, Forth::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NO_HISTORY
            })
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