package com.kunal.lab1.ex8;

import java.util.Scanner;

public class Exercise_8 {
	public static boolean checkNumber(int n) {
		if (n<= 0 ) {
			return false ; 
			
		}
		
		while (n > 1 ) { 
			if ( n % 2 != 0 ) {
				return false ; 
			}
			
			n = n/2 ; 
		}
		return true ; 
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if (checkNumber(number)) {
			System.out.println(number + " is a power of 2 ");
		} else {
			System.out.print(number +" is not a power of 2 ");
		}
		sc.close();
	}

}
