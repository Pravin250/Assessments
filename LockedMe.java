package com.pravin.learning;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

 class LockedMe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to LockedMe.com");
		System.out.println();
		
		
        File theFile = new File("test.txt");
		System.out.println("File exists : " + theFile.exists());
		
		File newFolder = new File("newFolder");
		newFolder.mkdir();
		
		File theFiles = new File(newFolder, "test.txt");
		try {
			theFiles.createNewFile();
			
		} catch (IOException e) {
			System.out.println("Issues : " + e.getMessage());
		}
		
		
		
		try {
			theFile.createNewFile();
			System.out.println("File exists now : " + theFiles.exists());
		
		    System.out.println("test.txt deleted : " + theFiles.delete());
		    
		    String []fileNames = new String[30];
		    fileNames = newFolder.list();
		   
		    for(String name : fileNames) {
		    	System.out.println("File : " + name);
		    }
		
		
		
		} catch (IOException e) {
			System.out.println("issues : " + e.getMessage());
			e.printStackTrace();
		}
	
 while(true) {
		System.out.println("To execute case 1, Enter value 1");
		System.out.println("To execute case 2, Enter value 2");
		System.out.println("To execute case 3, Enter value 3");
		System.out.println("To execute case 4, Enter value 4");
		System.out.println("To execute case 5, Enter value 5");
		System.out.println("To exit, Enter value 9");
		
		System.out.println("Enter your choice::");
		int choice = scan.nextInt();
		switch(choice) {
		case 1: System.out.println("Staff Lockers");
		break;
		case 2: System.out.println("Laminate Lockers");
		break;
		case 3: System.out.println("Air Lockers");
		break;
		case 4: System.out.println("Automatic Lockers");
		break;
		case 5: System.out.println("DIY Lockers");
		break;
		case 9: System.out.println("Existing application");
		System.exit(0);
		default: System.out.println("Incorrect input, Please select your option from the menu");
		}
		}
	}
}
	

