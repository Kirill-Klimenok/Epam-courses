package com.company.Task_7;

import com.company.Task_2.Task_2;

import java.util.Arrays;

public class Task_7  {
    private int[] mass_1, mass_2;
    public Task_7(int num1,int num2) {
        this.mass_1 = new int[num1];
        this.mass_2 = new int[num2];
        setMass();
    }
    public void copyMass() {
        int m=mass_1.length;
        mass_1 = Arrays.copyOf(mass_1, mass_1.length + mass_2.length);
        System.arraycopy(mass_1, 0, mass_1, mass_1.length-m , m);
        System.arraycopy(mass_2, 0, mass_1, m, mass_2.length );
        Arrays.sort(mass_1);
        System.out.println(Arrays.toString(mass_1));
    }


   private void setMass(){
        for(int i = 0; i< mass_1.length; i++){
            mass_1[i]=(int)(0+Math.random()*50);
        }
        for(int i = 0; i< mass_2.length; i++){
            mass_2[i]=(int)(50+Math.random()*100);
        }
   }



}
