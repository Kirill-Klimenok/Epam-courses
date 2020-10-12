package com.company.Task_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_2 {
    private int[] mass_1, mass_2;

    public Task_2() {
        this.mass_1 = new int[]{1, 3, 5, 7, 9};
        this.mass_2 = new int[]{2, 4, 6, 8, 10};
    }

    public void copyMass() {
        int m=mass_1.length;
        mass_1 = Arrays.copyOf(mass_1, mass_1.length + mass_2.length);
        System.arraycopy(mass_1, 0, mass_1, mass_1.length-m , m);
        System.arraycopy(mass_2, 0, mass_1, m, mass_2.length );
        Arrays.sort(mass_1);
        System.out.println(Arrays.toString(mass_1));
    }



}
