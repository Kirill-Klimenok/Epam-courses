package com.company.Task_2;

public class Task_2 {
    private double b, a, c, result;

    public double getResult(double b, double a, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.result = (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) -
                Math.pow(a, 3) * c + Math.pow(b, -2));

        System.out.println("Task 2");

        return result;

    }
}
