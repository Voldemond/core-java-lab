package com.kunal.lab3.ex3;

public class Exercise_3 {
	
	public static String changeString(String str) {
		
		String result = "" ; 
		
		for(int i = 0 ; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			char lower = Character.toLowerCase(ch);
			
			if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
				
				result = result + ch ; 
				
				
			}else {
				char  nextChar = (char)(ch + 1 );
				result = result + nextChar ;
			}
		}
		return result ; 
		
	}
	public static void main(String[] args) {
		
		
		String input = "JAVA"; 
		
		String output = changeString(input);
		
		System.out.println("Result : "+ output);
	}
}
