package com.example.demo.repositories;

import com.example.demo.models.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Integer> {
   Borrow findByUserIDAndSerialNumber(@Param("userID") Integer userID, @Param("serialNumber") String serialNumber);

    boolean existsBorrowByUserIDAndSerialNumber(Integer userID, String serialNumber);

    Borrow findBorrowByUserIDAndSerialNumber(Integer userID, String serialNumber);

    @Transactional
    int deleteBorrowByUserIDAndSerialNumber(Integer userID, String serialNumber);

    List<Borrow> findBorrowByUserIDAndEndDateGreaterThanEqual(Integer userID, Date endDate);
}
