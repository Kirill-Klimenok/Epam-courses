package com.company.Task_7;

public class Task_7 {
    private float[][] mass;
    public Task_7(int N){
       this.mass=new float[N][N];
    }

    public void setMass() {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length; i++) {
                mass[j][i] = (float) Math.sin((i*i-j*j)/mass.length);
            }
        }
    }

    public void printMatrix() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
    }
}
