package com.pravin.training;

public class StringToStringBuilder {

	public static void main(String[] args) {
		String str[] = { "Joey", "Neel", "Pravin"};
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]);
		sb.append(" " +str[1]);
		sb.append(" " +str[2]);
		
		System.out.println(sb.toString());
	}

}
