package com.kunal.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Exercise_1 {
	
	public List<Integer> getValues(HashMap<Integer, Integer>map	){
		
		List<Integer> list = new ArrayList<>(map.values());
		
		Collections.sort(list);
		
		return list; 
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 50);
		map.put(2, 20);
		map.put(3, 40);
		map.put(4, 10);
		
		Exercise_1 obj = new Exercise_1();
		
		List<Integer> result = obj.getValues(map);
		
		System.out.println("Sorted values : "+ result);
	}
}
