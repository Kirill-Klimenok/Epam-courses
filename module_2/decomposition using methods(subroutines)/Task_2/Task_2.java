package com.company.Task_2;

public class Task_2 {

    private final int a;
    private final int b;
    private final int c, d;

    public Task_2(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        searchGCD();
    }

    private int searchGCD() {    // поиск наибольшего общего делетеля
        int maxD = 1;

        for (int i = 1; i <= Math.min(Math.min(a, b), Math.min(c, d)); i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0 && i > maxD) maxD = i;
        }

        return maxD;
    }
}
