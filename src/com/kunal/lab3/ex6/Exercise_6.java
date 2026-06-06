package com.kunal.lab3.ex6;

public class Exercise_6 {
	
	public static boolean isPositiveString(String str)	{
		
		
		str = str.toUpperCase();
		
		for(int i = 0 ; i < str.length() - 1 ; i++) {
			
			char ch1 = str.charAt(i);
				
					char ch2 = str.charAt(i+ 1 );
			
			if(ch2 <= ch1) {
				return false ; 
			}
		}
		
		return true ; 
	}
	
	public static void main(String[] args) {
		
		String input = "ANT"; 
		
		boolean result = isPositiveString(input); 
		
		System.out.println("Result: "+result);
	}
}
