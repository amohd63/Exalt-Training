package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.models.User;
import com.example.demo.models.Book;
import com.example.demo.models.Subscription;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.BookDOA;
import com.example.demo.repositories.SubscriptionDOA;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	BookDOA bookRepository;
	@Autowired
	SubscriptionDOA subscriptionRepository;

	public List<User> getAll() {
		return userRepository.findAll();
	}

	public String deleteUser(User user) {
		userRepository.delete(user);
		return "Success";

	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public String addUser(User user) {
		userRepository.save(user);
		return "success";
	}
	
	public String subscribe(Subscription subscription) {
		subscriptionRepository.save(subscription);
		return "success";
	}
}