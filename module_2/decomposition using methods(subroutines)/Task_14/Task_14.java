package com.company.Task_14;

import java.util.Arrays;

public class Task_14 {
    private final int[] mass;
    private final int num;

    public Task_14(int num) {
        this.num = num;
        this.mass = new int[num];
    }

    public void enumeration() {
        int k = 0;
        for (int i = 1; i < num; i++) {
            if (isArmstrong(i)) {
                mass[k] = i;
                k++;
            }
        }
    }

    private boolean isArmstrong(int i) {
        int multiply = 0;
        char[] ch = Integer.toString(i).toCharArray();
        for (char element :
                ch) {
            multiply += Math.pow(Integer.parseInt(String.valueOf(element)), String.valueOf(i).length());
        }
        return multiply == i;

    }
    public void print(){
        System.out.println(Arrays.toString(mass));
    }
}
