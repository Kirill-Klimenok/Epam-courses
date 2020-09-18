package com.company.Task_4;

public class Task_4 {
    private double A, B;

    public Task_4(double a, double b) {
        this.A = a;
        this.B = b;
    }

    public void setSize(double x, double y, double z) {
        if (y <= A && z <= B) {
            System.out.println("Кирпич пройдёт ");
        } else System.out.println("Кирпич не пройдёт");

    }

}
