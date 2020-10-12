package com.company.Task_1;

public class Task_1 {
    private int[][] mass;//mass[0].length - размер столбцов . mass.length -размер строк
    private int n, m;//n-количество столбцов, m- количество строк

    public Task_1(int m, int n) {
        this.n = n;
        this.m = m;
        this.mass = new int[m][n];
        setMass(mass);
       // printMatrix(mass);
       // System.out.println("нечётные строки ");
        //specialOutput(mass);
    }

    private void setMass(int[][] mass) {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (0 + Math.random() * 10);
            }
        }
    }

    private void printMatrix(int[][] mass) {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
    }

    private void specialOutput(int[][] mass) {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                if (i % 2 != 0 && mass[0][i] > mass[mass.length - 1][i]) {
                    System.out.print(mass[j][i] + " ");


                }
            }
            System.out.println();
        }

    }

}


