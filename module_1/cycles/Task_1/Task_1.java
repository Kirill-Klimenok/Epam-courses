package com.company.Task_1;

public class Task_1 {
    public void factorial(int a){
        if(a>0)
        {
            int x = 1, i = 1;
            do {
                i++;
                x *= i;

            } while (i < a);
            System.out.println("!" + a + " = " + x);
        }
        else System.out.println("Error");
    }
}
