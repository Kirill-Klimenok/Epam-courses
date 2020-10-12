package com.company.Task_4;

public class Task_4 {
    private int[][] mass;//mass[0].length - размер столбцов . mass.length -размер строк
    private int n, m;

    public Task_4( int n) {
        if(n%2==0) {
            this.n = n;
            this.mass = new int[n][n];
            setMass(mass);
            // printMatrix(mass);
        }
        else return;

    }

    private void setMass(int[][] mass) {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length; i++) {
                if(j%2==0){
                    mass[j][i]=i+1;
                }
                else{
                    mass[j][i]= mass.length-i;
                }
            }
        }
    }

    private void printMatrix(int[][] mass) {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
    }
}
