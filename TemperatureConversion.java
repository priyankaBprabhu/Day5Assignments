package com.bridgelabs.java;

import java.util.Scanner;

public class TemperatureConversion {
    static int celsius( int temp ){
        return (temp - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Temperature fahrenheit");
        int temperature = sc.nextInt();
        int tempInCelsius = celsius( temperature);
        System.out.println("temperature  is  " + tempInCelsius + " Degrees Celsius");
    }

}
