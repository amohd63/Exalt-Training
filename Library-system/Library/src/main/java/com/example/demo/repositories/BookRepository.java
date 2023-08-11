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

     @Query(
            value = "SELECT * FROM Books B WHERE B.serial_number = :serialNumber",
            nativeQuery = true)
     List<Book> findBookByName(@Param("serialNumber") String serialNumber);


}
