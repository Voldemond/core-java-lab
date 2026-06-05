package com.kunal.lab1.ex4;

import java.util.Scanner ;

public class Exercise_4 {
		
	public static boolean isPrime(int num) {
		if(num < 2 ) {
			return false ; 
		}
		for ( int i = 2 ; i <= num / 2 ; i++) {
			if ( num % i == 0 ) {
				return false ; 
			}
		}
		return true ; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int limit = sc.nextInt();
		System.out.println("Prime numbers up to "+limit+":");
		
		for(int i =2 ; i <= limit ; i++) {
			if (isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
		sc.close();
	}
}
