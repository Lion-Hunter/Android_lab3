package com.example.lab3.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.lab3.R
import com.example.lab3.databinding.Task23Binding

class Third: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Task23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.to2From3.setOnClickListener {
            startActivity(Intent(this, Second::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            })
        }

        binding.to1From3.setOnClickListener {
            startActivity(Intent(this, First::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
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