package com.kunal.lab3.ex7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise_7 {
	
	public static void calculateDuration(int day , int month , int year) {
		
		LocalDate inputDate = LocalDate.of(year, month, day	);
		
		LocalDate currentDate = LocalDate.now();
		
		Period diff = Period.between(inputDate, currentDate);
				
				System.out.println("Years : " + diff.getYears());
				
				System.out.println("Months : " + diff.getMonths());
				
				System.out.println("Days : "+ diff.getDays());
				
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Day: ");
		
		int day = sc.nextInt();
		
		System.out.println("Enter Month : ");
		int month = sc.nextInt();
		
		System.out.println("Enter Year : ");
		int year = sc.nextInt()	;
		
		calculateDuration(day, month , year);
		
		sc.close();
	}
}
