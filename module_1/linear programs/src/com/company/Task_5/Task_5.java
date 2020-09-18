package com.company.Task_5;

public class Task_5 {

    public void getTime(int T) {

        int hours = 0, minutes = 0, seconds = 0;

        while (T >= 3600) {
            hours += 1;
            T -= 3600;
        }
        while (T >= 60) {
            minutes += 1;
            T -= 60;
        }
        seconds = T;
        System.out.println("Task 5" + '\n' + hours + " ч " + minutes + " мин " + seconds + " c");
    }
}
