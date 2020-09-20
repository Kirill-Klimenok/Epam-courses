package com.company.Task_10;

public class Task_10 {

    private int num;
    private int[] mass;


    public Task_10(int num) {
        this.num = num;
        this.mass = new int[num];

        setMass(mass);
        printMass(mass);
        compression(mass);
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
            mass[i] = (int) (1 + Math.random() * 100);
        }
    }

    private void compression(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0)
                mass[i] = 0;
        }
        int n;
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length-1; i++)
                if (mass[i] == 0 && mass[i + 1] != 0) {
                    n=mass[i];
                    mass[i] = mass[i + 1];
                    mass[i+1]=n;
                }
        }
    }
}



