package com.pravin.training;

import java.util.*;
public class WorkingWithCollections {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();//creating array list
		l.add("Pravin");//adding elements
		l.add("Neel");
		l.add("Joey"); 
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
