package com.company.Task_6;

public class Task_6 {
    private int[] mass;

    public Task_6(int num) {
        this.mass = new int[num];
        setMass(mass);
        printMass(mass);
        change(mass);

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
        System.out.println();
        for (int i = 1; i < mass.length; i++) {
            if (i%i==0) System.out.print(mass[i] + " ");
        }
    }

}
