package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.models.Borrow;
import com.example.demo.models.Subscription;
import com.example.demo.models.User;
import com.example.demo.services.BookService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService service;

    @GetMapping
    public List<Book> getLibraryBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public String addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @GetMapping(params = "serialNumber")
    public Book findBook(@RequestParam String serialNumber) {
        return service.findBook(serialNumber);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @DeleteMapping(params = "serialNumber")
    public int deleteBook(@RequestParam String serialNumber) {
        return service.deleteBook(serialNumber);
    }
}
