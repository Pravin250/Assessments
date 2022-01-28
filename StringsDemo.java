package com.pravin.training;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, n, search, flag=0;
		
		System.out.println("Enter the number of elements");
		n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements");
		
		for(i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the elements that needs to be searched");
		search = scan.nextInt();
		
		for(i=0; i<n; i++) {
			if(a[i]==search) {
				System.out.println("Element found");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not found");
		}
		
	}

}
