package com.company.Task_6;

import java.util.Arrays;

public class Task_6 {
    private final int[] mass;

    public Task_6(int n) {
        this.mass = new int[n];
        setMass(mass);

    }

    private void setMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 100);
        }
    }

    public void shellSorting() {
        for(int step=(int)Math.floor(mass.length/2);step>0;Math.floor(step/=2)){
            for(int pass=step;pass<mass.length;pass++){
                for(int replacment=pass-step;replacment>=0&&mass[replacment]>mass[replacment+step];replacment-=step){
                    int num=mass[replacment];
                    mass[replacment]=mass[replacment+step];
                    mass[replacment+step]=num;
                }
            }
        }
    }
    public void print(){
        System.out.println(Arrays.toString(mass));
    }
}
