package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;
import com.example.demo.models.User;
@Service
public class UserService {
private ArrayList<User> userList = new
ArrayList<User>(Arrays.asList(
new User("Ali","ali63","ali@gamil.com"),
new User("Mohammed","mohammed63","mohammed@hotmail.com")
));
public ArrayList<User> getUserList() {
return this.userList;
}
public boolean addUserToUserList (User user) {
	for (User user1 : userList) {
		if(user1.getEmail().equals(user.getEmail())) {
		return false;
		}
	}
return userList.add(user);
}
public boolean deleteUser (String userName) {
	for (User user : userList) {
		if(user.getUserName().equals(userName)) {
		userList.remove(user);
		return true;
		}
	}
	return false;
}
public boolean updateUser (User newUser,String email) {
	ArrayList<User> testList = new ArrayList<User>();
	for (int i=0; i< userList.size();i++) {
		User user = new User();
		user.setEmail(userList.get(i).getEmail());
		user.setUserName(userList.get(i).getUserName());
		user.setName(userList.get(i).getName());
		testList.add(user);
	}
	
	int x=-1;
	for (int i=0; i< userList.size();i++) {
		if(testList.get(i).getEmail().equals(email)) {
			testList.get(i).setEmail(newUser.getEmail());
			testList.get(i).setName(newUser.getName());
			testList.get(i).setUserName(newUser.getUserName());
			x=i;
		}
	}
	for (int i=0; i< testList.size();i++) {
		for (int j=0; j< testList.size();j++) {
			if(testList.get(i).getEmail().equals(testList.get(j).getEmail())&& i != j)
				return false;
		}
	}
	if(x!=-1) {
		userList.get(x).setEmail(testList.get(x).getEmail());
		userList.get(x).setName(testList.get(x).getName());
		userList.get(x).setUserName(testList.get(x).getUserName());
		return true;
	}
	return false;
}
public User getUserByUserName(String userName) {
	for (User user : userList) {
		if(user.getUserName().equals(userName)) {
		return user;
		}
	}
	return null;
}

}