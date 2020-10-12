package com.company.Task_1;

import java.util.Arrays;

public class Task_1 {
    private int[] mass_1;
    private int[] mass_2;
    private int size_1, size_2, k, m;

    public Task_1(int size_1, int size_2, int k) {
        this.size_1 = size_1;
        this.size_2 = size_2;
        this.k = k;
        this.mass_2 = new int[size_2];
        this.mass_1 = new int[size_1];
        this.m = mass_1.length - (k + 1);

    }

    public void setMass_1Mass_2() {
        for (int i = 0; i < mass_1.length; i++) {
            mass_1[i] = (int) (0 + Math.random() * 50);

        }
        for (int i = 0; i < mass_2.length; i++) {
            mass_2[i] = (int) (50 + Math.random() * 100);
        }
    }

    public void copyMass_1InMass_2() {
        mass_1 = Arrays.copyOf(mass_1, mass_1.length + mass_2.length);
       System.arraycopy(mass_1, k, mass_1, mass_1.length - m, m);
        System.arraycopy(mass_2, 0, mass_1, k + 1, mass_2.length );
    }

    public void print() {
        for (int i = 0; i < mass_1.length; i++) System.out.print(mass_1[i] + " ");
    }
}
