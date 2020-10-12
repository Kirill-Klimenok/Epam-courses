package com.company.Task_9;

public class Task_9 {

    private int[][] mass;
    private int[] sum;

    public Task_9(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
        this.sum = new int[num_2];
    }

    public void setMass() {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (0 + Math.random() * 10);
            }
        }
    }


    public  void print() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[] summElementsStl() {

        for (int j = 0; j < mass[0].length; j++) {
            for (int i = 0; i < mass.length; i++) {
                sum[j] += mass[i][j];
            }

        }
        return sum;
    }


}
