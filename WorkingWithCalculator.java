package com.pravin.training;

import java.util.Scanner;

public class WorkingWithCalculator {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double ans;
		
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		
		System.out.println("\nEnter an operation (+, -, *, /): ");
		op = scan.next().charAt(0);
		
		switch(op) {
		case '+' : ans = num1 + num2;
		break;
		case '-' : ans = num1 - num2;
		break;
		case '*' : ans = num1 * num2;
		break;
		case '/' : ans = num1 / num2;
		break;
		default: System.out.println("Error");
		return;
		
		}
		System.out.print("\n The result is:\n");
		System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
		
	}

}
