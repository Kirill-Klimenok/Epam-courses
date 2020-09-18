package com.company.Task_2;

public class Task_2 {
    public double min(double a, double b, double c, double d) {
        double result1, result2;
        if (a < b) result1 = a;
        else result1 = b;

        if (c < d) result2 = c;
        else result2 = d;
        if (result1 != result2) return max(result1, result2);
        else System.out.println("значения одинаковае" + (int) result1 + "=" + (int) result2);
        return 0;
    }

    private double max(double result1, double result2) {
        if (result1 > result2) System.out.println("Max: " + (int) result1);
        else System.out.println("Max: " + (int) result2);
        return 0;
    }
}
