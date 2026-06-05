package com.kunal.lab2.ex4;
import java.util.Arrays;
public class Exercise_04 {
    public static int[] modifyArray(int[] arr) {
        int uniqueCount = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = temp[i];
        }
        for (int i = 0; i < uniqueArray.length - 1; i++) {
            for (int j = 0; j < uniqueArray.length - 1 - i; j++) {
                if (uniqueArray[j] < uniqueArray[j + 1]) {
                    int swap = uniqueArray[j];
                    uniqueArray[j] = uniqueArray[j + 1];
                    uniqueArray[j + 1] = swap;
                }
            }
        }
        return uniqueArray;
    } 
    public static void main(String[] args) {
        int[] input1 = {5, 3, 5, 1, 3, 2};
        int[] result1 = modifyArray(input1);
        System.out.print("Input:  ");
        System.out.println(Arrays.toString(input1));
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result1));
        System.out.println();
    }
} 