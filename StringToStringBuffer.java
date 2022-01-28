package com.pravin.training;

import java.io.*;

public class StringToStringBuffer {

	public static void main(String[] args) {
		StringBuffer b = new StringBuffer();
		b.append("Pravin");
		b.append("neel");
		System.out.println(b);
		
		b.append(2503);
		System.out.println(b);

	}

}
