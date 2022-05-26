package com.bridgelabs.java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int fibonacciNum1 = 0;
        int fibonacciNum2 = 1;
        int fibonacci_num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value for the Fibonacci Series ");
        int number = sc.nextInt();
        System.out.print("Fibonacci series is" + " " + fibonacciNum1 + " " + fibonacciNum2);
        for(int i = 3; i <= number; i++) {
            fibonacci_num = fibonacciNum1 + fibonacciNum2;
            fibonacciNum1 = fibonacciNum2;
            fibonacciNum2 = fibonacci_num;
            System.out.print(" " + fibonacci_num);
        }
    }
}
