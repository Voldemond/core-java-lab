package com.kunal.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_7 {
	
	public int[] getSorted(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int num : arr) {
			String str = String.valueOf(num);
			
			String reversed = "";
			
			for(int i = str.length() - 1 ; i >=0 ; i--) {
				
				reversed = reversed + str.charAt(i);
			}
			
			int revNum = Integer.parseInt(reversed);
			
			list.add(revNum);
			
		}
		
		Collections.sort(list);
		
		int[] result = new int[list.size()];
		
		for(int i = 0 ; i < list.size(); i++	) {
			result[i] = list.get(i); 
		}
		
		return result ;
	}
	public static void main(String[] args) {
		
		Exercise_7 obj = new Exercise_7();
		
		int[] arr= {12, 45 , 31 } ; 
		
		int[] result = obj.getSorted(arr);
		
		System.out.println("Result : ");
		
		for( int num : result ) {
			
			System.out.println(num + " ");
		}
	}

}
