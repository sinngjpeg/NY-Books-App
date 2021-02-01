package com.example.nybooksapp.presetation.books

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nybooksapp.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book> {
        return listOf<Book>(
            Book("Title", "Author 1"),
            Book("Title", "Author 2"),
            Book("Title", "Author 3"),
            Book("Title", "Author 4"),
            Book("Title", "Author 5")
        )
    }
}