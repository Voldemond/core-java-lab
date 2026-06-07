package com.kunal.lab5.ex2;

import java.util.Scanner;

public class Exercise_2 {
		
	public static void validateName(String firstName,String lastName)
	throws InvalidNameException{
		if(firstName.isEmpty() || lastName.isEmpty()) {
			throw new InvalidNameException("First Name or Last Name cannot be Empty");
			
		}else {
			System.out.println("Valid Name :"+firstName+" "+lastName);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter First Name :");
		
		String firstName = sc.nextLine()	;
		
		System.out.println("Enter Last Name :");
		
		String lastName = sc.nextLine();
		
		try {
			validateName(firstName , lastName);
		}
		catch(InvalidNameException e ) {
			
			System.out.println("Exception :"+ e.getMessage());
		}
		sc.close();
	}
}
