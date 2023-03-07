package com.ua.robot.lesson17;

public class Main {
    public static void main(String[] args) {

        int numberDayOfWeek = 4;
        System.out.println(getNameDayOfWeek(numberDayOfWeek));
    }

    private static DayOfWeek getNameDayOfWeek(int numberDayOfWeek) {
        DayOfWeek day = null;
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            if ((i + 1) == numberDayOfWeek) {
                day = DayOfWeek.values()[i];
            }
        }
        return day;
    }
}
