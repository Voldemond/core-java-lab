package com.kunal.lab1.ex7;

public class Exercise_7 {

	public static boolean checkNumber (int number) {
		if ( number < 0 ) {
			number = -number ;
		}
		while ( number > 9 ) {
			int lastDigit = number % 10 ;
			
			int secondLastDigit = (number / 10)%10 ;
			
			if (secondLastDigit > lastDigit) {
				return false ; 
			}
			number = number / 10 ;
		}
		return true ; 
		
	}
	public static void main(String[] args) {
		
		System.out.println("134468 is increasing: " + checkNumber(134468));
        System.out.println("12345  is increasing: " + checkNumber(12345));  
        System.out.println("11111  is increasing: " + checkNumber(11111));  
        System.out.println("54321  is increasing: " + checkNumber(54321));  
        System.out.println("123321 is increasing: " + checkNumber(123321));
	}
}
