package com.kunal.lab2.ex1;
import java.util.Scanner; 

public class Exercise_1 {
	public static int findSecondSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length; i++) {
			
			if ( arr[i] < smallest) {
				secondSmallest = smallest ; 
				smallest = arr[i];
			}
			else if (arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i]; 
				
			}
		}
		return secondSmallest; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter ? ");
		
		int size = sc.nextInt()	;
		
		int[] numbers = new int[size];
		
		System.out.println("Enter the numbers one by one : ");
		
		for (int i = 0 ; i < size ; i++) {
			System.out.println("Enter number"+ (i+ 1 )+ ":"	);
			numbers[i] = sc.nextInt()	;
			
		
		}
		int result = findSecondSmallest(numbers);
		System.out.println("The second smallest number is : "+ result );
		sc.close();
	}

}
