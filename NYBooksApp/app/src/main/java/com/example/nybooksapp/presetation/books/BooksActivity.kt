package com.example.nybooksapp.presetation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooksapp.R
import com.example.nybooksapp.data.model.Book
import com.example.nybooksapp.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityBooksBinding.inflate(layoutInflater) //get layout
        super.onCreate(savedInstanceState)
        setContentView(binding.root)  //set layout

        binding.toolbarMain.title = getString(R.string.books_title) //set title toolbar
        setSupportActionBar(binding.toolbarMain) //set toolbar

        val viewModel: BooksViewModel = ViewModelProviders.of(this).get(BooksViewModel::class.java)
        viewModel.booksLiveData.observe(this, Observer {
            it?.let { books ->
                with(binding.recyclerBooks) {
                    layoutManager =
                        LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books)

                }
            }
        })

        viewModel.getBooks()
    }
}