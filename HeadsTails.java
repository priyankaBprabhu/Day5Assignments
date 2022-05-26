package com.Bridgelabs.java;

import java.util.Scanner;

class Percentage {
     int total;
     int pCent;
     int percent(double value, int total) {
         this.total = total;
         return pCent =(int) (value * 100 ) / this.total;
     }
}


public class HeadsTails {
    public static void main(String[] args) {
        double head = 0;
        double tails = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int num = sc.nextInt();
        Percentage percentage= new Percentage();
        for (int i = 0; i < num; i++){
            double flipCoin = Math.random();
            if(flipCoin > 0.5){
                head++;
            }
            else {
                tails++;
            }
        }
        int head_percentage = percentage.percent(head, num);
        System.out.println("total head percentage" + " " + head_percentage);
        int tails_percentage = percentage.percent(tails, num);
        System.out.println("total tails percentage" + " " + tails_percentage);

    }
}
