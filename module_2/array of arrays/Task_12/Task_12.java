package com.company.Task_12;

public class Task_12 {

    private int[][] mass;


    public Task_12(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
    }

    public void setMass() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (1 + Math.random() * 10);
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

    public void sortingStrOver() {

        int el;
        for (int k = 0; k < mass.length; k++)
            for (int j = 0; j < mass.length; j++) {
                for (int i = 0; i < mass[0].length - 1; i++) {
                    if (mass[k][i] > mass[k][i + 1]) {
                        el = mass[k][i];
                        mass[k][i] = mass[k][i + 1];
                        mass[k][i + 1] = el;
                    }
                }


            }
    }

    public void sortingStrLess() {

        int el;
        for (int k = 0; k < mass.length; k++)
            for (int j = 0; j < mass.length; j++) {
                for (int i = 0; i < mass[0].length - 1; i++) {
                    if (mass[k][i] < mass[k][i + 1]) {
                        el = mass[k][i];
                        mass[k][i] = mass[k][i + 1];
                        mass[k][i + 1] = el;
                    }
                }


            }
    }
}

