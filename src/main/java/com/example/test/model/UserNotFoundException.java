package com.example.test.model;

public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7488171325467901579L;

	public UserNotFoundException() {
	}

	public UserNotFoundException(String message) {
		super(message);
	}
	
	

}
