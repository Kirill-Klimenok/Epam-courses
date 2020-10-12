package com.company.Task_15;

import java.util.Arrays;

public class Task_15 {
    private int num;
    private final int[] sequenceNums;

    public Task_15(int n) {
        this.sequenceNums=new int[10*n];
        this.num = n;
        int[] mass = new int[n];
        String st = "";
        for (int el :
                mass) {
            st += 9;
        }
        num = Integer.parseInt(st);

    }

    public void enumeration() {
        int index=0;
        for (int i = 10; i < num; i++) {
            if(searchSequenceNum(i)){
                sequenceNums[index]=i;
                index++;
            }
        }
    }

    private boolean searchSequenceNum(int i) {
        char[] num = new char[String.valueOf(i).length()];
        num=Integer.toString(i).toCharArray();
        boolean is=false;
        int [] mass=new int [num.length];
        int index=0;
        for (char k:
             num) {
                mass[index]=Integer.parseInt(String.valueOf(k));
                index++;
        }
       for(int j=0;j<mass.length-1;j++){
           if(mass[j]==mass[j+1]-1){
               is=true;
           }
           else {
               is=false;
               break;
           }
       }


       return is;
    }

    public void print(){
        System.out.println(Arrays.toString(sequenceNums));
    }
}
