package com.bridgelabs.java;

import java.util.Scanner;

public class TemperatureConversion {
    static float celsius( float temp ){
        return (temp - 32) * 5 / 9;
    }
    static float fahrenheit( float temp ){
        return (temp * 9 / 5 )  + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Temperature fahrenheit");
        float temperatureFahrenheit = sc.nextFloat();
        float tempInCelsius = celsius( temperatureFahrenheit);
        System.out.println("temperature  is  " + tempInCelsius + " Degrees Celsius");
        System.out.println("Enter the  Temperature fahrenheit");
        float temperatureDegree = sc.nextFloat();
        float tempInFahrenheit = fahrenheit( temperatureDegree);
        System.out.println("temperature  is  " + tempInFahrenheit + " Fahrenheit");
    }

}
