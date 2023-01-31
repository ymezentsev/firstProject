package com.ua.robot.lesson7;

public class Main {
    public static void main(String[] args) {

        System.out.println(getCube(3));
        printSymbolNumberTimes(10);
        printSymbolNumberTimes(10, "/");
    }

    static int getCube(int number) {
        return number * number * number;
    }

    static void printSymbolNumberTimes(int number) {
        printSymbolNumberTimes(number, "*");
    }

    static void printSymbolNumberTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
