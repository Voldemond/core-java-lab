package com.kunal.lab5.ex3;

import java.util.Scanner;

public class Exercise_3 {
	
	public static void checkSalary(double salary)throws EmployeeException{
		
		if(salary < 3000) {
			throw new EmployeeException("Salary must be ast least 3000");
		}
		else {
			System.out.println("Valid salary");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary : ");
		
		double salary = sc.nextDouble()	;
		
		try {
			checkSalary(salary);
			
		}
		catch(EmployeeException e) {
			System.out.println("Exception : " +e.getMessage());
		}
		sc.close();
	}
}
