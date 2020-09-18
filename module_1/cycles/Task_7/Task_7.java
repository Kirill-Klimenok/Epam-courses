package com.company.Task_7;

public class Task_7 {
    public void del(int m,int n) {
        for (int j = m; j <= n; j++){
            System.out.print("делители числа "+j+" ");
            for (int i = 1; i <= n; i++) {
                if (j % i == 0) System.out.print(i+" ");
            }
            System.out.println();
    }
    }
}
