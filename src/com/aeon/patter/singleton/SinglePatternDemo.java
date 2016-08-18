package com.aeon.patter.singleton;

public class SinglePatternDemo {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.setMessage("Hello");
		System.out.println(object.getMessage());
		
		SingleObject object2 = SingleObject.getInstance();
		System.out.println(object2.getMessage());

	}

}
