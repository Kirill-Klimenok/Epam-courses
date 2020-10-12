package com.company.Task_4;

public class Task_4 {
    private int[] mass;

    public Task_4(int num) {
        this.mass = new int[num];
        setMass(mass);
        printMass(mass);
        swap(mass);
        printMass(mass);
    }

    private void setMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 200);
        }
    }

    private void swap(int[] mass) {
        int min = mass[0];
        int max = mass[0];
        int n = 0, k = 0;

        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i]) {
                max = mass[i];
                n = i;
            }
            if (min > mass[i]) {
                min = mass[i];
                k = i;
            }
        }
        mass[n] = min;
        mass[k] = max;

    }

    private void printMass(int[] mass) {
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
