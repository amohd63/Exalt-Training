package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.models.Borrow;
import com.example.demo.repositories.BorrowRepository;
import org.springframework.stereotype.Service;
import com.example.demo.models.User;
import com.example.demo.models.Book;
import com.example.demo.models.Subscription;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.SubscriptionRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    SubscriptionRepository subscriptionRepository;
    @Autowired
    BorrowRepository borrowRepository;

    public String subscribe(Subscription subscription) {
        subscriptionRepository.save(subscription);
        return "User subscribed to the library!";
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Subscription getUserSubscription(Integer userID) {
        List<Subscription> subscriptionList = subscriptionRepository.findAll();

        if (subscriptionList == null || subscriptionList.isEmpty()) {
            return null;
        }

        return subscriptionList.stream()
                .filter(subscription -> subscription.getUserID().equals(userID))
                .findFirst()
                .get();
    }

    public List<Borrow> getUserBorrowHistory(Integer userID) {
        List<Borrow> borrowList = borrowRepository.findAll();

        if (borrowList == null || borrowList.isEmpty()) {
            return null;
        }

        return borrowList.stream()
                .filter(borrow -> borrow.getUserID().equals(userID))
                .collect(Collectors.toList());
    }

    public String addUser(User user) {
        userRepository.save(user);
        return "User added successfully!";
    }

    public String addBook(Book book) {
        bookRepository.save(book);
        return "Book added successfully!";
    }

    public String borrowBook(Integer userID, String serialNumber) {
        borrowRepository.save(
                new Borrow(0, userID, serialNumber)
        );
        return "Borrowed the book successfully!";
    }

    public String extendBorrow(Integer userID, String serialNumber) {
        if (countUserBorrow(userID, serialNumber) > 2) {
            return "You can't extend borrowing the book.";
        }

        borrowRepository.save(
                new Borrow(0, userID, serialNumber)
        );

        return "Extended borrowing the book successfully!";
    }

    public long countUserBorrow(Integer userID, String serialNumber) {
        List<Borrow> borrowList = borrowRepository.findAll();

        if (borrowList == null || borrowList.isEmpty()) {
            return 0;
        }

        return borrowList.stream()
                .filter(borrow -> borrow.getUserID().equals(userID) && borrow.getBorrowID().equals(serialNumber))
                .count();
    }
}