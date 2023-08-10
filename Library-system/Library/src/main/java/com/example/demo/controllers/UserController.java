package com.example.demo.controllers;

import com.example.demo.models.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.models.Book;
import com.example.demo.models.Subscription;
import com.example.demo.services.UserService;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/subscribe")
    public String subscribe(@RequestBody Subscription subscription) {
        return service.subscribe(subscription);
    }

    @RequestMapping("/books")
    public List<Book> getLibraryBooks() {
        return service.getAllBooks();
    }

    @RequestMapping("/user_subscription/{userID}")
    public Subscription getUserSubscription(@PathVariable Integer userID) {
        return service.getUserSubscription(userID);
    }

    @RequestMapping("/borrow_history/{userID}")
    public List<Borrow> getUserBorrowHistory(@PathVariable Integer userID) {
        return service.getUserBorrowHistory(userID);
    }

    @PostMapping("/add_user")
    public String addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @PostMapping("/add_book")
    public String addBook(@RequestBody Book book) {
        return service.addBook(book);
    }


    @PostMapping("/borrow/{userID}/{serialNumber}")
    public String borrowBook(@PathVariable Integer userID, @PathVariable String serialNumber) {
        return service.borrowBook(userID, serialNumber);
    }

    @PostMapping("/extend_borrow/{userID}/{serialNumber}")
    public String extendBorrow(@PathVariable Integer userID, @PathVariable String serialNumber) {
        return service.extendBorrow(userID, serialNumber);
    }
}
