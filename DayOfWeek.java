package com.bridgelabs.java;

import java.util.Scanner;
class DayOfDate {
     public static int Day(int day, int month, int year) {
        int d = day;
        int m = month;
        int y = year;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ( (14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }
}

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value for the year ");
        int year = sc.nextInt();
        System.out.println("Enter the  value for the month ");
        int month = sc.nextInt();
        System.out.println("Enter the  value for the day ");
        int day = sc.nextInt();
        DayOfDate dayOfDate = new DayOfDate();
        int dayCalculated = dayOfDate.Day(day, month, year);
        System.out.println("Day of the date " + day + "/" + month + "/" + year + " is" + " " );
        switch (dayCalculated) {
            case 0 : System.out.println("Sunday"); break;
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday"); break;
            case 4 : System.out.println("Thursday"); break;
            case 5 : System.out.println("Friday"); break;
            case 6 : System.out.println("Saturday"); break;
        }


    }
}
