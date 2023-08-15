package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.models.Borrow;
import com.example.demo.models.Subscription;
import com.example.demo.models.User;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.BorrowRepository;
import com.example.demo.repositories.SubscriptionRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public String addBook(Book book) {
        if (bookRepository.existsById(book.getSerialNumber())) {
            return "Book already in the database!";
        }
        bookRepository.save(book);
        return "Book added successfully!";
    }

    @Transactional
    public Book findBook(String serialNumber) {
        return bookRepository.findBookBySerialNumber(serialNumber);
    }

    public Book updateBook(Book book) {
        Book bookObj = bookRepository.findBookBySerialNumber(book.getSerialNumber());
        if (bookObj == null){
            return null;
        }
        return bookRepository.save(book);
    }

    public int deleteBook(String serialNumber) {
        return bookRepository.deleteBookBySerialNumber(serialNumber);
    }
}
