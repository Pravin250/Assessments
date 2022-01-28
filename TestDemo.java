package com.pravin.training;

public class TestDemo {
	int cube(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		int cubeOfNumber = t.cube(2);
		
		System.out.println("Cube of 2 is: " + cubeOfNumber);
	}

}
