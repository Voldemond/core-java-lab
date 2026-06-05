package com.kunal.lab1.ex1;
import java.util.Scanner ;

public class Exercise_1 {
	public static void main(String[] args) {
		
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in); 
		
		int num = sc.nextInt();
		int sum = 0 ; 
		
		while(num > 0) {
			int digit = num % 10 ;
			
			sum =+ sum +(digit * digit * digit );
			num = num / 10 ;
		}
		sc.close();
		System.out.println("Sum of cube of digits  = " + sum );
	}
	

}
