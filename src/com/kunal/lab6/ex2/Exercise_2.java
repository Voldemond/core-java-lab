package com.kunal.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Exercise_2 {
	public Map<Character , Integer > countChars(char[] arr){
		
		Map<Character, Integer> map = new HashMap<>()	;
		
		for(char ch : arr) {
			
			if ( map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1 	); 
				
				
			}
			else {
				map.put(ch, 1);
			}
		}
		return map ; 
	}
	
	public static void main(String[] args) {
		Exercise_2 obj = new Exercise_2();
		
		char[] arr = {'a', 'b', 'a','c','b','a'	,'d'};
		
		Map<Character , Integer> result = obj.countChars(arr);
		
		System.out.println(result);
	}
}
