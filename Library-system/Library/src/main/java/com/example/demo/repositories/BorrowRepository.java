package com.example.demo.repositories;

import com.example.demo.models.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Integer> {
    @Query(
            value = "SELECT EXISTS (SELECT 1 FROM Borrow B WHERE B.userID = :userID and B.serial_number = :serialNumber)",
            nativeQuery = true)
    BigInteger existsByUserIDAndSerialNumber(@Param("userID") Integer userID, @Param("serialNumber") String serialNumber);

    @Query(
            value = "SELECT * FROM Borrow B WHERE B.userID = :userID and B.serial_number = :serialNumber",
            nativeQuery = true)
    Borrow findByUserIDAndSerialNumber(@Param("userID") Integer userID, @Param("serialNumber") String serialNumber);
}
