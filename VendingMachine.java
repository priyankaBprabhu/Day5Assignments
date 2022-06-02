package com.bridgelabs.java;

import java.util.Scanner;

public class VendingMachine {
    public static int runMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice  ;
        System.out.println("\nPlease enter your selection:" + "\n 1: Snickers \t 125" + "\n2: Dairy milk \t 130" + "\n3: almond treat \t 150" + "\n4: Pepsi \t 185" + "\n5:   Exit ");
        choice = keyboard.nextInt();
        if (choice >= 5)
            throw  new RuntimeException("\n \n you did not selected any item\n\n");
        return choice;
    }

    public static int retrievePrice(int menuChoice){
        if (menuChoice == 1)
            return 125;
        if (menuChoice == 2)
            return 130;
        if (menuChoice == 3)
            return 150;
        if (menuChoice == 4)
            return 185;
        else return 0;
    }

    public static int moneyInserted(int price){
        Scanner keyboard = new Scanner(System.in);
        int money ;
        System.out.println("Your item costs: " + price + " Please insert the  money:");
        money = keyboard.nextInt();
        while (money < price){
            System.out.println("Please insert sufficient funds");
            money = money + keyboard.nextInt();
        }
        return money - price ;
    }

    public static void changeOut(int change){
        int thousand = 0;
        int five_Hundred = 0;
        int hundred = 0;
        int fifty = 0;
        int twentyFive = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        while (change >= 1000){
            thousand = thousand + 1;
            change = change - 1000;
        }
        while (change >= 500){
            five_Hundred = five_Hundred + 1;
            change = change - 500;
        }
        while (change >= 100){
            hundred = hundred + 1;
            change = change - 100;
        }
        while (change >= 50){
            fifty = fifty + 1;
            change = change - 50;
        }
        while (change >= 25){
            twentyFive = twentyFive + 1;
            change = change - 25;
        }
        while (change >= 10){
            ten = ten + 1;
            change = change - 10;
        }
        while (change >= 5){
            five = five + 1;
            change = change - 5;
        }
        while (change >= 1){
            one = one + 1;
            change = change - 1;
        }
        System.out.printf("\nHere's your change:\n %d thousand, %d five_Hundred, %d hundred,  %d fifty, %d twentyFive, %d ten , %d five, %d one and  rupees ",
                thousand  ,  five_Hundred , hundred , fifty , twentyFive , ten , five , one  , change);
    }
    public static void main(String[] args) {
        int food = runMenu();
        int price = retrievePrice(food);
        int change = moneyInserted(price);
        changeOut(change);
    }

}
