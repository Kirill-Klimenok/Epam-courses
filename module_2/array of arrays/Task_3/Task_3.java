package com.company.Task_3;

public class Task_3 {
    private int[][] mass;//mass[0].length - размер столбцов . mass.length -размер строк
    private int n, m;

    public Task_3(int m, int n,int k,int p) {
        this.n = n;
        this.m = m;
        this.mass = new int[m][n];
        setMass(mass);
       // printMatrix(mass);
        //System.out.println("Вывод заданной строки и заданного столбца");
       // printSpecifedElements(mass,k,p);

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

    private void printSpecifedElements(int[][] mass, int k, int p) {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                if (j == k) System.out.print(mass[j][i] + " ");

            }

        }
        System.out.println();
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                if (i == p) System.out.println(mass[j][i] + " ");

            }

        }

    }
}
