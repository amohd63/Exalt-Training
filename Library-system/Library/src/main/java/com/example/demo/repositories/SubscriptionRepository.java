package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

}
