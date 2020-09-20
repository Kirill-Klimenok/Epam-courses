package com.company.Task_7;

public class Task_7 {

    private int num;//количество элементов массива
    private int[] mass;


    public Task_7(int num) {
        this.num=num;
        this.mass=new int[num];

        setMass(mass);
        printMass(mass);
        Max(mass);


    }

    private void printMass(int[] mass){
        System.out.println();
        for(int i=0;i<mass.length;i++)
            System.out.print(mass[i]+" ");

        System.out.println();
    }
    private void setMass(int[]mass){
        for(int i=0;i<mass.length;i++){
            mass[i]=(int)(0+Math.random()*100);
        }
    }

    private void Max(int[] mass){
        int max=1;
        int k=0;
        for(int i=0;i<mass.length-1;i++){
            k=mass[i]+mass[i+1];
            if(k>max) max=k;

        }
        System.out.println(max);
    }
}
