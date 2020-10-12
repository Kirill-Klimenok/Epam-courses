package com.company.Task_3;

public class Task_3 {
    private int[] mass;

    public Task_3(int num) {
        this.mass = new int[num];
        setMass(mass);
        printMass(mass);
        getCounts(mass);
    }

    private void setMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (-200 + Math.random() * 400);
        }
    }

    private void printMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    private void getCounts(int[] mass) {
        int plus = 0, minus = 0, nOll = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) plus++;
            else if (mass[i] < 0) minus++;
            else nOll++;

        }
        System.out.println("\n Положительных элементов: " + plus + "\n Отрицательных элементов: " + minus + "" + "\n нулевых элементов: " + nOll);
    }
}
