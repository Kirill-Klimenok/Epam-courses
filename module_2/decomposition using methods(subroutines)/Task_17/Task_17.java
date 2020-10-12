package com.company.Task_17;

public class Task_17 {
    public int number;

    public Task_17(int num) {
        this.number = num;
    }
    public int subtraction(){
        int counter=0;
        do {
            number-=decompositionIntoANnumber();
            counter++;
        }
        while(number!=0);
        return counter;
    }

    private int decompositionIntoANnumber() {
        char[] num;
        num = Integer.toString(number).toCharArray();
        int [] mass=new int[num.length];
        int index=0;
        for (char k:
             num) {
            mass[index]=Integer.parseInt(String.valueOf(k));
            index++;

        }
        return summ(mass);
    }
    private int summ(int[] mass){
        int sum=0;
        for (int element:
             mass) {
            sum+=element;
        }
        return sum;
    }

}
