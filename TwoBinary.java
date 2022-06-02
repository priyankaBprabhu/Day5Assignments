package com.bridgelabs.java;

import java.util.Scanner;

public class TwoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        String binary = Integer.toString(num, 2);
        System.out.println(Integer.toString(num, 2));
        System.out.println(binary);
        switch (binary.length() % 8) {
            case 0: System.out.println(binary);break;
            case 1: System.out.println("0000000" + binary);break;
            case 2: System.out.println("000000" + binary);break;
            case 3: System.out.println("00000" + binary);break;
            case 4: System.out.println("0000" + binary);break;
            case 5: System.out.println("000" + binary);break;
            case 6: System.out.println("00" + binary);break;
            case 7: System.out.println("0" + binary);break;
        }
    }
}
