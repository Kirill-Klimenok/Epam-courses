package com.company.Task_6;

public class Task_6 {

    public Task_6(int n) {
        if (n % 2 == 0) {
            //mass[0].length - размер столбцов . mass.length -размер строк
            int[][] mass = new int[n][n];
            setMass(mass);
           // printMatrix(mass);
        }

    }

    private void setMass(int[][] mass) {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length; i++) {
                if (j > 0) {
                    if(j<=(mass.length/2)-1){
                        mass[j][i]=0;
                    }
                    else mass[j][i] = 1;

                } else mass[j][i] = 1;

            }
        }
    }

    private void printMatrix(int[][] mass) {
        for (int j = 0; j < mass[0].length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
    }
}
