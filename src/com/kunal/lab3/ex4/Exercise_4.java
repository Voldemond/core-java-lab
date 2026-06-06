package com.kunal.lab3.ex4;

public class Exercise_4 {
	public static int modifyNumber(int number) {
		
		String numStr = String.valueOf(number);
		
		String result = ""; 
		
		for(int i = 0 ; i < numStr.length() -1 ; i++) {
			
			int digit1 = numStr.charAt(i)-'0';
			
			int digit2 = numStr.charAt(i+1 )-'0';
			
			int diff = Math.abs(digit1 - digit2);
			
			result = result + diff ;
			
		}
		
		result = result + numStr.charAt(numStr.length() -1 );
			
			return Integer.parseInt(result);
			
			
		}
	
	public static void main(String[] args ) {
		
		int input = 45862 ;
		
		int output = modifyNumber(input);
		
		System.out.println("Result : "+ output);
	}
	}

