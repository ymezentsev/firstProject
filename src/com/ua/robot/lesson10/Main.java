package com.ua.robot.lesson10;

public class Main {
    public static void main(String[] args) {
        ArrayWork array = new ArrayWork(10);
        array.printArray();

        array.ascendingSort();
        array.printArray();

        array.descendingSort();
        array.printArray();
    }
}
