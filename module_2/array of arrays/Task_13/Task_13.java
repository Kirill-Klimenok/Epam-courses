package com.company.Task_13;

public class Task_13 {

    private int[][] mass;


    public Task_13(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
    }

    public void setMass() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (10 + Math.random() * 80);
            }
        }
    }


    public void print() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void sortingStlOver() {

        int el;
        for (int k = 0; k < mass[0].length; k++)
            for (int j = 0; j < mass[0].length; j++) {
                for (int i = 0; i < mass.length - 1; i++) {
                    if (mass[i][k] > mass[i+1][k ]) {
                        el = mass[i][k];
                        mass[i][k] = mass[i + 1][k];
                        mass[i + 1][k] = el;
                    }
                }


            }
    }

    public void sortingStlLess() {
        int el;
        for (int k = 0; k < mass[0].length; k++)
            for (int j = 0; j < mass[0].length; j++) {
                for (int i = 0; i < mass.length - 1; i++) {
                    if (mass[i][k] < mass[i+1][k ]) {
                        el = mass[i][k];
                        mass[i][k] = mass[i + 1][k];
                        mass[i + 1][k] = el;
                    }
                }


            }
    }
}
