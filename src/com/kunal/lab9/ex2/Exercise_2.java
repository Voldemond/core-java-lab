package com.kunal.lab9.ex2;

public class Exercise_2 {

    public static boolean validateUsername(String username) {

        if (!username.endsWith("_job")) {
            return false;
        }

        String namePart = username.substring(0, username.length() - 4);

        if (namePart.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(validateUsername("abcdefgh_job")); 
        System.out.println(validateUsername("abc_job"));     
        System.out.println(validateUsername("abcdefghi_job"));
        System.out.println(validateUsername("abcdefghi"));    
    }
}
