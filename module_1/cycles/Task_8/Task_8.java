package com.company.Task_8;

public class Task_8 {
    public void setNums(int num1, int num2) {
        int result=0;
        System.out.println(num1+": ");
        while (num1>=1){
            result=num1%10;
            System.out.print(result+" ");
            num1/=10;
        }
        System.out.println("\n"+num2+": ");
        while (num2>=1){
            result=num2%10;
            System.out.print(result+" ");
            num2/=10;
        }
    }
}
