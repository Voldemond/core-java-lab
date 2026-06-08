package com.kunal.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Exercise_3 {
	
	public Map<Integer , Integer > getSquares(int[] arr){
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			
			int square = num * num ; 
			
			map.put(num, square);
			
			
		}
		return map ; 
		
		
	}
	public static void main(String[] args) {
		
		Exercise_3 obj = new Exercise_3(); 
		
		int[] arr = {25, 32 , 44, 15 };
		
		Map<Integer , Integer> result = obj.getSquares(arr); 
		
		System.out.println(result);
	}
}
