package com.kunal.lab1.ex2;

import java.util.Scanner ; 


public class Exercise_2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a LIGHT : ");
		System.out.println("1 = RED");
		System.out.println("2 = YELLOW");
		System.out.println("3 = GREEN");
		
		System.out.println("Enter Your Choice: ");
		
		int choice = sc.nextInt(); 
		
		if (choice == 1 ) {
			System.out.println("STOP");
		}
		else if (choice == 2 ) {
			System.out.println("READY");
		}
		else if(choice == 3 ){
			System.out.println("GO");
		}
		sc.close();
	}
}
