package com.kunal.lab3.ex1;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of Integers ( seperated by spaces):");
		
		String line = sc.nextLine()	;
		String[] parts = line.split(" ");
		int sum = 0 ; 
		System.out.println("\nThe integers are: ");
		for(int i = 0 ; i < parts.length;i++) {
			int num = Integer.parseInt(parts[i]);
			System.out.println(num);
			sum = sum + num	; 
			
		}
		System.out.println("\nSum of all integers = "+ sum);
		sc.close();
	}
}
