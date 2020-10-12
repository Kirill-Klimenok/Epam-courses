package com.company.Task_3;

public class Task_3 {
    private final int a;

    public Task_3(int a) {
        this.a = a;
    }

    public double square() {
        return 6 * squareTriangle();
    }

    private double squareTriangle() {
        return 0.5 * Math.pow(a, 2) * Math.sqrt(3) / 2;
    }
}
