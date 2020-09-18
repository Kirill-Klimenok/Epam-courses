package com.company.Task_4;

public class Task_4 {
    public void multiply() {
        int x = 1, result = 1;
        do {
            result *= Math.pow(x, 2);
            x++;
        }
        while (x < 200);
        System.out.println("Произведение квадратов первых 200 чисел: " + result);

    }
}
