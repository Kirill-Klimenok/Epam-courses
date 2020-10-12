package com.company.Task_5;

public class Task_5 {
    private int[][] mass;//mass[0].length - размер столбцов . mass.length -размер строк
    private int n, m;

    public Task_5(int n) {
        if (n % 2 == 0) {
            this.n = n;
            this.mass = new int[n][n];
            setMass(mass);
           // printMatrix(mass);
        } else return;

    }

    private void setMass(int[][] mass) {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length; i++) {
                if(j>0){
                    if(i>=mass.length-j){
                        mass[j][i]=0;
                    }
                    else mass[j][i]=j+1;
                }
                else mass[j][i]=j+1;
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
