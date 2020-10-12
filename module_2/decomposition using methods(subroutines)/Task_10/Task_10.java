package com.company.Task_10;

public class Task_10 {
    private int N;
    private int[] mass;

    public Task_10(int n) {
        this.N = n;
        this.mass = new int[String.valueOf(Math.abs(N)).length()];
    }


    private int getNum() {
        int n = N % 10;
        N = (int) Math.floor(N / 10);
        return n;
    }

    public int[] setMass() {
        for (int i = mass.length - 1; N > 0; i--) {
            mass[i] = getNum();
        }

        return mass;
    }
}
