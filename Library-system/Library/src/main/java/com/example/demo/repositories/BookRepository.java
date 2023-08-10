package com.example.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.User;
import com.example.demo.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
