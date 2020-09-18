package com.company.Task_5;

public class Task_5 {
    public double[] k;
    public int num;

    public void setnum(int num) {
        int i = 0;
        this.k = new double[num];
        while (i < k.length) {
            k[i] = (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            i++;
        }
    }


    public double summ(double e) {
        double result = 0;
        int i = 0;
        while (i < k.length) {
            if (k[i] >= e) {
                result += k[i];
            }
            i++;
        }

        return result;
    }
}
