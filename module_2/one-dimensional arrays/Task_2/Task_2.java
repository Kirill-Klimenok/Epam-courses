package com.company.Task_2;

public class Task_2 {
    private  int Z;//число на которое будут заменены элементы массива
    private int num;//количество элементов массива
    private int[] mass;


    public Task_2(int num,int z) {
        this.num=num;
        this.mass=new int[num];
        this.Z = z;
        setMass(mass);
        printMass(mass);
        sorting(mass,z);
        printMass(mass);

    }

    private void printMass(int[] mass){
        for(int i=0;i<mass.length;i++)
        System.out.print(mass[i]+" ");

        System.out.println();
    }
    private void setMass(int[]mass){
        for(int i=0;i<mass.length;i++){
            mass[i]=(int)(0+Math.random()*100);
        }
    }

    private void sorting(int[] mass,int z){
        for(int i=0;i<mass.length;i++){
            if(mass[i]>z) mass[i]=z;
        }
    }
}
