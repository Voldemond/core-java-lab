package com.kunal.lab2.ex3;

public class Exercise_3 {
	public static int[] getSorted(int[] arr) {
		for(int i= 0 ; i < arr.length; i++) {
			String numStr = String.valueOf(arr[i]);
			
			String reversedStr = ""; 
			
			for (int j = numStr.length() - 1 ; j >=0 ; j--) {
				reversedStr = reversedStr + numStr.charAt(j);
				
			}
			arr[i] = Integer.parseInt(reversedStr);
		}
		for (int i = 0 ; i< arr.length -1 ; i++) {
			for( int j= 0; j<arr.length - 1 -i ; j++) {
				if (arr[j] > arr [j + 1 ]) {
					int temp = arr[j];
					arr[j] = arr[j+1 ];
					arr[j+ 1 	] = temp ;
				}
			}
		}
		return arr; 
	}
	public static void main(String[] args) {
		int[] numbers = { 123, 456 , 15 , 234 , 67 } ;
		
		System.out.println("Original Array: "	);
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]+" ");
		}
		int[] result = getSorted(numbers);
		
		System.out.println("\n\nAfter Reversing and Sorting: ");
		for (int i = 0 ; i < result.length; i++	) {
			System.out.println(result[i] + " ");
		}
	}

}
