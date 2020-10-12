package com.company.Task_15;

public class Task_15 {
    private int[][] mass;


    public Task_15(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
    }

    public void setMass() {
        int n = 0;

        for (int j = 0; j < mass.length; j++) {

            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (0 + Math.random() * 100);
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

    private int findMaxEl() {
        int max = mass[0][0];
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                if (max < mass[j][i]) {
                    max = mass[j][i];
                }
            }
        }
        return max;
    }
    public void changeOdds(){
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                if(mass[j][i]%2!=0){
                    mass[j][i]=findMaxEl();
                }
            }
        }
    }
}
