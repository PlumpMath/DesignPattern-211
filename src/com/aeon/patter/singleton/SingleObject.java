package com.aeon.patter.singleton;

public class SingleObject {
	
	// sample variable
	private String message;
	
	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	// make the constructor private so that this class cannot be instantiated
	private SingleObject() {}
	
	// get the only object availble
	public static SingleObject getInstance() {
		return instance;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
