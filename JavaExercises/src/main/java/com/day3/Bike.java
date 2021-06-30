package com.day3;

public class Bike extends Cycle {
	String defineMe() {
		return "a cycle with an engine";
	}

	Bike() {
		System.out.println("Hello, I am a Bike I am " + defineMe());
		String temp = super.defineMe();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}
