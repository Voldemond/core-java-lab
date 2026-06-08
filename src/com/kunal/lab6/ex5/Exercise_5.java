package com.kunal.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_5 {
	
	public int getSecondSmallest(int[]arr) {
		
		List<Integer> list = new ArrayList<>();
		
		
		for(int num : arr) {
			
			list.add(num);
		}
		
		Collections.sort(list);
		
		return list.get(1);
	}
	public static void main(String[] args) {
		
		Exercise_5 obj = new Exercise_5()	;
		
		int[] arr = {5,3,2,8,4,7 };
		
		int result = obj.getSecondSmallest(arr);
		
		System.out.println("Second smallest: "+ result);
	}
}
