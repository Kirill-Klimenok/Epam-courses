package com.company.Task_5;

public class Task_5 {
    private final int[] mass;

    public Task_5(int n) {
        this.mass = new int[n];
        setMass();
        System.out.println(searcEl());
    }

    private void setMass() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 100);
        }
    }

    public int searcEl() {
        int max = searchMaxEl();
        int k = mass[0];
        for (int value : mass) {
            k = value;
            for (int j : mass) {
                if (k < max && k < j) {
                    k = j;
                }
            }
        }
        return k;
    }

    private int searchMaxEl() {
        int max = mass[0];
        for (int j : mass) {
            if (max < j) max = j;
        }
        return max;
    }
}
