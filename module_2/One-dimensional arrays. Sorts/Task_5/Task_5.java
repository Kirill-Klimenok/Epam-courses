package com.company.Task_5;


import java.util.Arrays;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Task_5 {
    private int[] mass;
    public Task_5(int size){
    this.mass=new int[size];
    //this.search=searches;
        setMass();
    }

    private void setMass(){
        for(int i=0;i<mass.length;i++){
            mass[i]=(int)(0+Math.random()*100);
        }
    }



    public void sorting(){
        for (int max = 0; max < mass.length; max++) {
            int least = max;
            for (int j = max + 1; j < mass.length; j++) {
                if (mass[j] > mass[least]) {
                    least = j;
                }

            }
            int tmp = mass[max];
            mass[max] = mass[least];
            mass[least] = tmp;
        }
        System.out.print(Arrays.toString(mass));


    }


    public int binarySearch( int key, int first, int last) {
        int index = -1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (mass[mid] < key) {
                first = mid + 1;
            } else if (mass[mid] > key) {
                last = mid - 1;
            } else if (mass[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
