package com.company.Task_6;

public class Task_6 {
    public void getAscii() {
        char[] mass = new char[53];
        int i = 0;
        for (char c = 'A'; c <= 'z'; c++) {
            char s = 0;
            s += c;
            mass[i] = s;

            if (c == 'Z') c = 'a' - 1;

            System.out.println(mass[i] + " = " + "(ASCII) " + (int) mass[i]);
            i++;
        }


    }
}


