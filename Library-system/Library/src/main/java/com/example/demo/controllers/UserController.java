package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.models.Book;
import com.example.demo.models.Subscription;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return service.getAll();
	}
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}
	
	@PostMapping("/delete")
	public String deleteUser(@RequestBody User user) {
		return service.deleteUser(user);
	}

	@PostMapping("/users")
	public String addOne(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PostMapping("/subscribe")
	public String subscribe(@RequestBody Subscription subscription) {
		return service.subscribe(subscription);
	}
}
