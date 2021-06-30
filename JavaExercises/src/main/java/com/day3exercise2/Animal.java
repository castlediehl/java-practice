package com.day3exercise2;

public class Animal {
	private String furColor;

	void walk() {
		System.out.println("I am walking");
	}

	void makeNoise() {
		System.out.println("Making Noise");
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
		System.out.println("Fur Color: " + this.furColor);
	}

}
