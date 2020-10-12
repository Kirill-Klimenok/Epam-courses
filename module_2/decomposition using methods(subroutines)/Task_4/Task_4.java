package com.company.Task_4;

public class Task_4 {
    private int[] x, y;
    private int n;

    public Task_4(int n) {
        this.x = new int[n];
        this.y = new int[n];
        this.n = n;
        setXY();
        gettingMoreDistance();
    }

    private void setXY() {
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (0 + Math.random() * 20);
            y[i] = (int) (0 + Math.random() * 20);
        }
    }

    public void gettingMoreDistance() {
        double k = 0;
        int xy = 0, xy2 = 0;
        double AB;
        for (int j = 0; j < x.length; j++) {
            for (int i = 1; i < x.length; i++) {
                AB = Math.sqrt(Math.pow(x[i] - x[j], 2) + (Math.sqrt(y[i] - y[j])));
                if (k < AB) {
                    k = AB;
                    xy = j;
                    xy2 = i;

                }
            }
        }
        System.out.print("наибольшее рассторяние: " + k + "\n точки: " + "A[" + x[xy] + "," + x[xy] + "]" + " и " + "B[" + x[xy2] + "," + x[xy2] + "]");
    }

}
