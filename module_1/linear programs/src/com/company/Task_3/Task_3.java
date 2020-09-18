package com.company.Task_3;

public class Task_3 {
    private double x, y, result;

    public double getResult(double x, double y) {
        this.x = x;
        this.y = y;
        this.result = (((Math.sin(x) + Math.cos(y)) /
                (Math.cos(x) - Math.sin(y))) * Math.tan(x * y));
        System.out.println("Task 3");
        return result;
    }
}
