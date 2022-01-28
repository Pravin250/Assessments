package com.pravin.training;

public class Student {
	int studentId;
	String studentName;
	
	Student(int id, String name){//Parameterized constructor
		this.studentId = id;
		this.studentName = name;
	}
	

	public static void main(String[] args) {
		Student s1 = new Student(100, "Pravin");
		Student s2 = new Student(101, "Neel");
		Student s3 = new Student(102, "Joey");
		s1.info();
		s2.info();
		s3.info();
		
  }


void info() {
	System.out.println("Id: " +studentId +" Name: " +studentName);
	
}
}
