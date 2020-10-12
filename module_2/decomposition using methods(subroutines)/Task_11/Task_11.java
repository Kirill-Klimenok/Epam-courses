package com.company.Task_11;

public class Task_11 {
    private final int num1;
    private final int num2;

    public Task_11(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int moreNumbers() {
        if (comparison()) return num1;

        else return num2;

    }

    private boolean comparison() {
        int size1 = String.valueOf(Math.abs(num1)).length(), size2 = String.valueOf(Math.abs(num2)).length();
        return size1 > size2;
    }
}
