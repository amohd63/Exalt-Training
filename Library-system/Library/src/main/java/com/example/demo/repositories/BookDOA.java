package com.example.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.User;
import com.example.demo.models.Book;

public interface BookDOA extends JpaRepository<Book, Integer> {

}
