package com.company.Task_4;

public class Task_4 {
    private double num;


    public float setNum(double num) {

        this.num = num;

        return swap(num);

    }

    private float swap(double num) {

        float count = (int) num;
        float result = (float) ((float) count / 1000 + (num - count) * 1000);

        System.out.println("Task 4");

        return result;
    }
}
