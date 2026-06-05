package com.kunal.lab1.ex3;

import java.util.Scanner;
public class Exercise_3 {
    // Recursive way
    public static int recursive(int n) {
        if (n <= 2) {
            return 1;
        }
        return recursive(n - 1) + recursive(n - 2);
    }
    // Non-recursive way
    public static int nonRecursive(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Recursive: " + recursive(n));
        System.out.println("Non-recursive: " + nonRecursive(n));
        sc.close();
    }
}
