package com.ua.robot.lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        printArray(array);
        System.out.println("Min value = " + getMinValue(array));
        System.out.println("Max value = " + getMaxValue(array));
        System.out.println("Average = " + getAverage(array));
        System.out.println("Sum of elements = " + getSum(array));
    }

    static void fillArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int getMinValue(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    static int getMaxValue(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    static double getAverage(int[] array) {
        return (double) getSum(array) / array.length;
    }

    static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
