package com.kunal.lab5.ex1;

import java.util.Scanner;

public class Exercise_1 {
	
	public static void validateAge(int age) throws InvalidAgeException{
		
		if (age <= 15 ) {
			
			throw new InvalidAgeException("Age must be above 15");
			
		}
		else {
			System.out.println("Valid Age");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		
		int age = sc.nextInt()	;
		
		try {
			validateAge(age);
		}
		catch (InvalidAgeException e) {
			
			System.out.println("Exception :"+e.getMessage()	);
		}
		sc.close();
	}
}
