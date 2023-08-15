package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.User;
import com.example.demo.models.Book;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    Book findBookBySerialNumber(String serialNumber);

    Book updateBook(Book book);

    int deleteBookBySerialNumber(String serialNumber);
}
