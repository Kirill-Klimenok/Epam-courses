package com.company.Task_9;

public class Task_9 {
    private int num;
    private int[] mass;


    public Task_9(int num) {
        this.num = num;
        this.mass = new int[num];

        setMass(mass);
        printMass(mass);
        sotring(mass);

    }

    private void printMass(int[] mass) {
        System.out.println();
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");

        System.out.println();
    }

    private void setMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (1 + Math.random() * 9);
        }
    }

    private void sotring(int[] mass) {
        int[] chisla = new int[mass.length];
        int min = 100;
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length; i++) {
                if (mass[j] == mass[i]&&j!=i) chisla[j] += 1;
            }
        }
        for (int j = 0; j < mass.length; j++) {
            if (chisla[j] > 0) {
                if (min > mass[j]) {
                    min = mass[j];
                }
            }
        }
        System.out.println("\n минимальное число повторяющиеся в массиве: " + min);
    }
}
