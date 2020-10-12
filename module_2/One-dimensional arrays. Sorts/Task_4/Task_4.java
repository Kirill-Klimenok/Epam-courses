package com.company.Task_4;

public class Task_4 {
    private int number;
    private int[] mass;

    public Task_4(int size) {
        this.mass = new int[size];
        this.number = number = 0;
    }

    public void setMass() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 100);
        }
    }

    public void sorting() {
        int k;
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length-1; i++) {
                if (mass[i +1] < mass[i]) {
                    k = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = k;
                    number++;
                }
            }
        }
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("\nКоличество итераций: "+number);
    }
}
