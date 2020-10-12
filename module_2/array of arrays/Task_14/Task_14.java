package com.company.Task_14;

public class Task_14 {
    private int[][] mass;


    public Task_14(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
    }

    public void setMass() {
        int n = 0;

        for (int j = 0; j < mass[0].length; j++) {

            for (int i = 0; i < mass.length; i++) {
                if (n != j + 1) {
                    {
                        mass[i][j] = 1;
                        n++;

                    }

                } else  {
                    mass[i][j] = 0;
                }
            }
            n = 0;
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


}
