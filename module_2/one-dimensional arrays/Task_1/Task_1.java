package com.company.Task_1;

import java.util.Scanner;

public class Task_1 {
    public Task_1(int n) {
        int[] mass = new int[n];
        setMass(mass);
    }
    private void setMass(int[] mass){
        for(int i=0;i<mass.length;i++){
            mass[i]= (int) (0+Math.random()*100);
        }


         Summ(mass);
    }

    private void Summ(int[] mass) {
        int k, result = 0;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % k == 0) result += mass[i];
        }
       System.out.println(result);
    }
}
