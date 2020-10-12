package com.company.Task_8;

public class Task_8 {
    private int num;
    private int[] mass;


    public Task_8(int num) {
        this.num = num;
        this.mass = new int[num];

        setMass(mass);
        printMass(mass);
        delElement(mass);
        printMass(mass);

    }

    private void printMass(int[] mass) {
        System.out.println();
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");

        System.out.println();
    }

    private void setMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 1000);
        }
    }

    private int getMin(int[] mass) {
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) min = mass[i];
        }
        return min;
    }

    private void delElement(int[] mass) {
        int min = getMin(mass);
        for (int i = 0; i < mass.length; i++) {
            if (min == mass[i]) mass[i] = 0;

        }
        for (int j = 0; j < mass.length; j++)
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] == 0 && mass[i + 1] != 0) mass[i] = mass[i + 1];


            }
    }

}
