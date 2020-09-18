package com.company.Task_5;

public class Task_5 {
    private final double x;

    public Task_5(double X) {
        this.x = X;
    }

    public void funkF() {
        double result;
        if (x <= 3) result = x * x - 3 * x + 9;
        else result = 1 / (Math.pow(x, 3) + 6);

        System.out.println("Значение функции F: " + result);

    }
}
