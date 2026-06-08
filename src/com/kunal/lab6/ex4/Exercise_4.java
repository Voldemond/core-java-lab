package com.kunal.lab6.ex4;

import java.util.*;

public class Exercise_4 {

    public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> map) {

        HashMap<Integer, String> result = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int regNo = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                result.put(regNo, "Gold");
            } 
            else if (marks >= 80 && marks < 90) {
                result.put(regNo, "Silver");
            } 
            else if (marks >= 70 && marks < 80) {
                result.put(regNo, "Bronze");
            }
        }

        return result;
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(101, 95);
        map.put(102, 82);
        map.put(103, 76);
        map.put(104, 65);

        Exercise_4 obj = new Exercise_4();

        HashMap<Integer, String> result = obj.getStudents(map);

        System.out.println(result);
    }
}