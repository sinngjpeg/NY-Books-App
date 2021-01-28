package com.example.nybooksapp.presetation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nybooksapp.R
import com.example.nybooksapp.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityBooksBinding.inflate(layoutInflater) //get layout
        super.onCreate(savedInstanceState)
        setContentView(binding.root)  //set layout

        binding.toolbarMain.title = getString(R.string.books_title) //set title toolbar
        setSupportActionBar(binding.toolbarMain) //set toolbar
    }
}