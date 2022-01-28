package com.pravin.training;

public class WorkingWithAccessModifiers {

	public static void main(String[] args) {
		Human human = new Human();
		
	    human.legCount = 2;
	    human.handCount = 2;
		human.display();

	}

}
 class Human {
	public int legCount;
	public int handCount;
	
	public void display() {
		System.out.println("Human.");
		System.out.println("Have" + legCount  + "legs..");
        System.out.println("Have" + handCount + "hands..");
	}
}
