package com.company.Task_2;

public class Task_2 {
    public void functionValue(int a, int b, int h) {
        int result;
        for (int i = a; i < b; i += h) {
            if (i > 2) {
                result = i;
                System.out.println("y = " + result);
            } else {
                result = -i;
                System.out.println("y = " + result);
            }

        }
    }
}
