package com.ua.robot.lesson5;

public class FindMax {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        if(number1 > number2) {
            System.out.println("Number1 = " + number1 + " is more than number2 =  " + number2);
        }
        else if (number1 == number2) {
            System.out.println("Number1 = " + number1 + " is equal to number2 =  " + number2);
        }
        else {
            System.out.println("Number2 = " + number2 + " is more than number1 =  " + number1);
        }
    }
}
