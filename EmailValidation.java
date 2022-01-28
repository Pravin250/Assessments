package com.pravin.training;


	import java.util.regex.*;    
	import java.util.*;    
	public class EmailValidation{  
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();
	        
	        emails.add("joeyFsd@domain.co.in");  
	        emails.add("NeelSql@domain.com");  
	        emails.add("johnFs.name@domain.com");  
	        emails.add("Neel#@domain.co.in");  
	        emails.add("joey@domain.com");  
	        emails.add("Neel@domaincom");  
	       
	        //Add invalid emails in list 
	        emails.add("@yahoo.com");  
	        emails.add("javaFullstack#domain.com");  
	        
	        //Regular Expression   
	        String regex = "^(.+)@(.+)$"; 
	        
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  
