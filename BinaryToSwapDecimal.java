package com.bridgelabs.java;//package com.bridgelabs.java;
//
//import java.util.Scanner;
//
//public class BinaryToSwapDecimal {
//    static int swapNibbles(int num)
//    {
//
//        return ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int decimalNum = sc.nextInt();
//        String binaryNum = Integer.toBinaryString(decimalNum);
//        System.out.println("Decimal to binary Converted number " + binaryNum);
//        int swapNum = swapNibbles(decimalNum);
//        String swapBinaryNum = Integer.toBinaryString(swapNum);
//        System.out.println("Swapped binary  number " + swapBinaryNum);
//        System.out.println("Swapped decimal  number " + swapNum);
//
//    }
//}
import java.util.Scanner;

public class SwapingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Numbers before swaping");
        System.out.println(num1);
        System.out.println(num2);


        int swap1 = num2;
        int swap2 = num1;

        System.out.println("Numbers after swaping");
        System.out.println(swap1);
        System.out.println(swap2);

    }
}