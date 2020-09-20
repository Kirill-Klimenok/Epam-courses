package com.company.Task_5;

public class Task_5 {
    private int[] mass;

    public Task_5(int num) {
        this.mass = new int[num];
        setMass(mass);
        printMass(mass);
        change(mass);
        printMass(mass);
    }

    private void setMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 30);
        }
    }

    private void printMass(int[] mass) {
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    private void change(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > i) System.out.print(mass[i] + " ");
        }
    }
}
