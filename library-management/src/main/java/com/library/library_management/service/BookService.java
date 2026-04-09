package com.library.library_management.service;

import com.library.library_management.exception.BookNotFoundException;
import com.library.library_management.model.Book;
import com.library.library_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // Get all books from the database
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get a single book by ID
    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            throw new BookNotFoundException("Book not found with ID: " + id);
        }
    }


    // Save a new book to the database
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Search by title
    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    // Search by author
    public List<Book> searchByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    // Search by ISBN
    public Optional<Book> searchByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }
}
