package com.company.Task_7;

public class Task_7 {
    private int sumF;

    public Task_7() {
        this.sumF = 0;
    }

    public int sumFactorial() {

        for (int i = 1; i <= 9; i++) {
            sumF += factorial(i);
        }
        return sumF;
    }


    private int factorial(int n) {
        int factorial = 1;
        for (int i = 0; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
