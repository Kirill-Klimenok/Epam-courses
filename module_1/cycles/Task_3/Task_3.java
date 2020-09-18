package com.company.Task_3;

public class Task_3 {
    public void summ() {
        int x = 1, summ = 0;
        do {
            summ += Math.pow(x, 2);
            x++;
        }
        while (x < 100);
        System.out.println("Сумма квадратов первых 100 чисел: " + summ);
    }
}
