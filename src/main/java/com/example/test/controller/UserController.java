package com.example.test.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.example.test.model.User;
import com.example.test.service.UserService;

@ManagedBean(name="userController", eager=true)
public class UserController {

	

	@ManagedProperty(value = "#{userSvc}")
	private UserService userService;

	public List<User> getListOfUsers() {

		return userService.getUsers();
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String addUser(User u) {
		
		userService.addUser(u);	
		
		return "listOfUser?faces-redirect=true";
	}
}
