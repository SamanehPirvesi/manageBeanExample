package com.example.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.example.test.model.User;

@ManagedBean(name="userSvc" , eager=true)
@SessionScoped
public class UserService {
	private List<User> users;
	
	
	public UserService() {
		users=new ArrayList<> ();
			
		users.add(new User("aaaa", "1234"));
		users.add(new User("vvv", "8890"));
		users.add(new User("kkk", "989"));
		
		
	}


	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
	public void addUser(User u) {
		users.add(u);
	}

}
