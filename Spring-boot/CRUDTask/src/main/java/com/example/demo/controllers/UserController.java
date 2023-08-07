package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("/users")
	public ArrayList<User> getAllUsers() {
		return service.getUserList();
	}
	
	@RequestMapping("/users/{userName}")
	public User getUserByUserName(@PathVariable String userName) {
		return service.getUserByUserName(userName);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public boolean addUser(@RequestBody User user) {
		return service.addUserToUserList(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{userName}")
	public boolean deleteUser(@PathVariable String userName) {
		return service.deleteUser(userName);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/userUpdate/{email}")
	public boolean updateUser(@RequestBody User user, @PathVariable String email) {
		return service.updateUser(user, email);
	}
}
