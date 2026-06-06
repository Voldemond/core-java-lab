package com.kunal.lab2.ex2;


public class Exercise_2 {
public static String[] sortStrings(String[] arr) {
	for (int i = 0; i < arr.length - 1 ; i++) {
		for(int j = 0 ; j < arr.length - 1 ; j++ ) {
			if ( arr[j].compareToIgnoreCase(arr[j + 1])> 0) {
				String temp = arr[j]; 
				arr[j] = arr[j + 1 ]; 
				arr[j + 1] = temp ; 
				
			}
		}
	}
	
	int uppercount = arr.length / 2 ; 
	if ( arr.length % 2  != 0 ) { 
		uppercount = (arr.length / 2 ) + 1 ; 
	}
	for (int i = 0; i < uppercount; i++) {
        arr[i] = arr[i].toUpperCase();
	}
	for (int i = uppercount; i < arr.length; i++) {
        arr[i] = arr[i].toLowerCase();
    }
    return arr;
}
public static void main(String[] args) {
	String[] words = {"Banana", "Apple", "Mango", "Grapes", "Cherry", "Pineapple"};

	System.out.println("Original Array: ");
    for (int i = 0; i < words.length; i++) {
        System.out.println("Position " + (i + 1) + ": " + words[i]);
    }
    String[] result = sortStrings(words);
    
    System.out.println("\nSorted Array Result: ");
    for (int i = 0; i < result.length; i++) {
        System.out.println("Position " + (i + 1) + ": " + result[i]);
    }
    
}
}
