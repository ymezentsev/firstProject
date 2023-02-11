package com.ua.robot.lesson10;

import java.util.Arrays;
import java.util.Random;

public class ArrayWork {
    private int[] array;
    private int size;

    public ArrayWork(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("You entered array's size <= 0.\n" +
                    "Default array's size = 10.");
            this.size = 10;
        }
        array = new int[this.size];
        fillArray();
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void ascendingSort() {
        Arrays.sort(array);
    }

    public void descendingSort() {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    private void fillArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }
}
