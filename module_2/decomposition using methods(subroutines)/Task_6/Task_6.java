package com.company.Task_6;

public class Task_6 {
    private final int num1, num2, num3;

    public Task_6(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    private boolean easyNumber(int num) {
        boolean k = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                k = false;
                break;
            }

        }
        return k;
    }

    public boolean getInfoAboutNumberst() {
        return easyNumber(num1) && easyNumber(num2) && easyNumber(num3);

    }

    public void print() {
        if (getInfoAboutNumberst()) {
            System.out.println("все 3 числa взаимно простые");
        } else System.out.println("числа не взаимно простые");
    }

}
