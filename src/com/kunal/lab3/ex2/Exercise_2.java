package com.kunal.lab3.ex2;

public class Exercise_2 {
	
	public static String getImage(String str) {
		
		String reverse = "";
		
		for(int i = str.length()- 1; i >=0 ; i-- ) {
			
			reverse = reverse + str.charAt(i);
		}
		
		return str + "|" + reverse ;
	}
	
	public static void main(String[] args) {
		String input = "EARTH"; 
		
		String output = getImage(input);
		
		System.out.println("Result : "+ output );
	}
}
