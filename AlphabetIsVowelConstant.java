package com.Bridgelabs.java;

import java.util.Scanner;

public class AlphabetIsVowelConstant {
    public  static void main(String[] args) {
        char[] s = {'a', 'e', 'i', 'o', 'u'};
        boolean count = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = sc.next().charAt(0);
        for(int i = 0; i < s.length; i++) {
            if(ch == s[i]) {
               count = true;
            }
       }
        if(count) {
            System.out.println("the character is vowel");
        }
        else {
            System.out.println("the character is consonant");
        }
    }
}