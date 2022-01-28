package com.pravin.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithRegularExpressions {

	public static void main(String[] args) {
		
		String input = "This is Pravin's bicycle";
		Pattern pattern = Pattern.compile("bicycle");
		
		System.out.println("input string: " + input);
		
		Matcher matcher = pattern.matcher(input);
		input = matcher.replaceFirst("bike");
		System.out.println("\nreplaceFirst method:" +input);
		input = matcher.replaceAll("bicycle");
		System.out.println("\nreplaceAll method: " +input);

	}

}
