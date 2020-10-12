package com.company.Task_1;

public class Task_1 {
    private final int a;
    private final int b;

    public Task_1(int a, int b) {
        this.a = a;
        this.b = b;
        searchGCM();
    }

    private int searchGCD() {    // поиск наибольшего общего делетеля
        int maxD = 1;
        for (int i = 1; i <= (Math.min(a, b)); i++) {
            if (a % i == 0 && b % i == 0 && i > maxD) maxD = i;
        }

        return maxD;
    }

    private int searchGCM(){    // поиск наименьшего общего кратного
        return a*b/searchGCD();
    }
}
