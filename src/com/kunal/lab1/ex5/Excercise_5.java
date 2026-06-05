package com.kunal.lab1.ex5;

import java.util.Scanner;

public class Excercise_5 {
	
	public int calculateSum(int n ) {
		int sum = 0 ; 
		
		for (int i = 1 ; i < n ; i++) {
			
			if(i % 3 == 0 || i % 5 == 0 ) {
				sum = sum + i ; 
			}
		}
		return sum ; 
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		Excercise_5 obj = new Excercise_5();
		
		int result = obj.calculateSum(n);
		System.out.println("Sum of numbers divisilbe by 3 or 5 = " + result);
		sc.close();
	}

}
