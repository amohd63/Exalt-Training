package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Subscription;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
    @Query(
            value = "SELECT EXISTS (SELECT 1 FROM Subscription S WHERE S.userID = :userID)",
            nativeQuery = true)
    BigInteger existsByUserID(@Param("userID") Integer userID);

    @Query(
            value = "SELECT * FROM Subscription S WHERE S.userID = :userID",
            nativeQuery = true)
    Subscription findByUserID(@Param("userID") Integer userID);
}
