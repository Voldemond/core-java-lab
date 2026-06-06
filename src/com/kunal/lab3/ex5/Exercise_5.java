package com.kunal.lab3.ex5;

import java.util.Scanner;

public class Exercise_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String line ; 
		
		int charCount = 0 ; 
		
		int wordCount = 0 ; 
		
		int lineCount = 0 ; 
		
		while (true ) {
			line =sc.nextLine()	;
			
			if(line.equals("END")) {
				break;
			}
			lineCount++;
			
			charCount = charCount + line.length()	;
			
			String[] words = line.split(" ");
			
			wordCount = wordCount + words.length; 
			
		}
		System.out.println("Characters : "+ charCount);
		
		System.out.println("Words : "+ wordCount);
		
		System.out.println("Lines: "+ lineCount);
		
		sc.close();
		
	}
}
