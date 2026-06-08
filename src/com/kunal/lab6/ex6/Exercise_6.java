package com.kunal.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_6 {
	
	public List<Integer> votersList(Map<Integer,Integer>map){
		
	List<Integer> list = new ArrayList<>();
	
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		
		int id = entry.getKey();
		int age = entry.getValue();
		
		if(age > 18 ) {
			list.add(id);
		}
	}
	return list ; 
}
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(101, 20);
		map.put(102, 18);
		map.put(103, 25);
		map.put(104, 16);
		
		Exercise_6 obj = new Exercise_6();
		
		List<Integer> result = obj.votersList(map);
		
		System.out.println("Eligible voters : "+result);
	}
}