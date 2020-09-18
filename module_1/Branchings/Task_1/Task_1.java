package com.company.Task_1;

public class Task_1 {
    private int a1, a2;

    public int SetA1A2(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
        return triengle(a1, a2);
    }

    private int triengle(int a1, int a2) {
        if (a1 + a2 < 180) {
            int a3 = 180 - (a1 + a2);
            if (a3 == 90 || a2 == 90 || a3 == 90) System.out.println("этот треугольник прямогугольный ");

            else System.out.println("этот треугольник существует , но он не прямоугольный");

        } else System.out.println("Данного треугольника не существует");
        return 0;
    }

}
