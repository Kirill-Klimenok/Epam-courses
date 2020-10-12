package com.company.Task_2;

public class Task_2 {
    private int[][] mass;
    private int n;

    public Task_2( int n) {
        this.n = n;

        this.mass = new int[n][n];
        setMass(mass);
      //  printMatrix(mass);
       //System.out.println("Элементы на главной диагонали ");
       // printElementOfDiagonal(mass);
    }

    private void setMass(int[][] mass) {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (0 + Math.random() * 2);
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

    private void printElementOfDiagonal(int[][] mass){
        int i=0;
        for (int j = 0; j < mass.length; j++) {
           System.out.print(mass[j][i]+" ");
           i++;
        }
    }
}
