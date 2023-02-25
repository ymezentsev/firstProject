package com.ua.robot.lesson9;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        //List<Integer> numbers = getIntegerList(checkAndReturnNumber());

        // System.out.println(getMinimum(numbers));

            int[] array = {30, 2, 10, 4, 6};
            int length = array.length;

            int tmp;
            boolean statusSort = false;
            while(!statusSort) {
                statusSort = true;
                for (int i=0; i<array.length-1; i++) {
                    if(array[i]>array[i+1]) {
                        tmp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = tmp;
                        statusSort = false;
                    }
                }
            }

            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    private static int checkAndReturnNumber() {
        Scanner scan;
        boolean isNumber = false;

        do {
            scan = new Scanner(System.in);
            if (!scan.hasNextInt())
                System.out.println("You enter not a number. Try again.");
            else
                isNumber = true;
        } while (!isNumber);

        int numb = scan.nextInt();
        return numb;
    }

    private static int getMinimum(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static List<Integer> getIntegerList(int count) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            numbers.add(checkAndReturnNumber());
        }
        return numbers;
    }


}
