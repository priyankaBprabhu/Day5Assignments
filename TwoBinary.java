package com.bridgelabs.java;

import java.util.Scanner;

public class TwoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();

        String str = Integer.toString(num, 2);
        System.out.println(Integer.toString(num, 2));
        System.out.println(str);
    }
}
