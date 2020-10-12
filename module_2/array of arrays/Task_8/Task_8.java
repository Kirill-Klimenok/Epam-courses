package com.company.Task_8;

import com.company.Task_9.Task_9;

public class Task_8 {
    private int st_1, st_2;
    private int[][] mass;

    public Task_8(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
    }

    public void setSt_1St_2(int st_1, int st_2) {
        if (st_1 > 0 & st_2 > 0) {
            this.st_1 = st_1-1;
            this.st_2 = st_2-1;
        }
        else{
            return;
        }
    }

    public int getSt_2() {
        return st_2;
    }

    public int getSt_1() {
        return st_1;
    }


    public void setMass() {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (0 + Math.random() * 100);
            }
        }
    }


    public void permutation() {
        int n;
        for (int i = 0; i < mass.length; i++) {
            n = mass[i][getSt_1()];
            mass[i][getSt_1()] = mass[i][getSt_2()];
            mass[i][getSt_2()] = n;
        }
    }
}
