package com.library.library_management.controller;

import com.library.library_management.model.Book;
import com.library.library_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    // GET /books - returns all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // GET /books/{id} - returns a single book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // GET /books/search?title= or ?author= or ?isbn=
    @GetMapping("/search")
    public Object searchBooks(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String isbn) {

        if (title != null) {
            return bookService.searchByTitle(title);
        } else if (author != null) {
            return bookService.searchByAuthor(author);
        } else if (isbn != null) {
            return bookService.searchByIsbn(isbn);
        } else {
            return bookService.getAllBooks();
        }
    }

    // POST /books - adds a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
}

