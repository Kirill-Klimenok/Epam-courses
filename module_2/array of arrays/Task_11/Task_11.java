package com.company.Task_11;

public class Task_11 {

    private int[][] mass;


    public Task_11(int num_1, int num_2) {
        this.mass = new int[num_1][num_2];
    }

    public void setMass() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (0 + Math.random() * 15);
            }
        }
    }


    public void print(int[][] mass) {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int sorting(){
        int[] MaxSt=new int[mass.length];
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                if(mass[j][i]==5){
                    MaxSt[j]+=1;
                }
            }
        }
        int max=-1;
        for(int i=0;i< mass.length;i++){
            if(max<MaxSt[i]) max=MaxSt[i];
        }

        return max;
    }

}
