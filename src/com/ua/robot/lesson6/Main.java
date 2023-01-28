package com.ua.robot.lesson6;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        int result;
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        while ((first + second) < 100) {
            result = first + second;
            first = second;
            second = result;
            System.out.print(result + " ");
        }
    }
}
