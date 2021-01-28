package com.example.nybooksapp.presetation.books

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooksapp.data.model.Book
import com.example.nybooksapp.databinding.ItemBookBinding

class BooksAdapter(
    private val books: List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        return BooksViewHolder(
            ItemBookBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = books.count()

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }

    class BooksViewHolder(
        val itemBookBinding: ItemBookBinding
    ) : RecyclerView.ViewHolder(itemBookBinding.root) {
        fun bindView(book: Book) {
            itemBookBinding.title.text = book.title
            itemBookBinding.author.text = book.author
        }
    }
}