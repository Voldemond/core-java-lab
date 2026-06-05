package com.kunal.lab1.ex6;
import java.util.Scanner ; 
public class Exercise_6 {
	
	public int calculateDifference(int n) {
		int sumOfSquares = 0 ; 
		int sum = 0 ; 
		
		for (int i = 1 ; i <=n ; i++) {
			sumOfSquares = sumOfSquares + (i * i );
			sum = sum + i ; 
		}
		
		int squareOfSum = sum * sum ; 
		
		int difference = sumOfSquares - squareOfSum; 
		return difference ; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		Exercise_6 obj = new Exercise_6();
		int result = obj.calculateDifference(n);
		
		System.out.println("Difference = " + result );
		sc.close();
	}

}
