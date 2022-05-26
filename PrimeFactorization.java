package com.Bridgelabs.java;
import java.util.Scanner;

class Factors {
    void Factor(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }
}

public class PrimeFactorization {
    public static void main(String[] args) {
        Factors f = new Factors();
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        System.out.println("Prime factors of number" + " " + n);
        f.Factor(n);
    }

}
