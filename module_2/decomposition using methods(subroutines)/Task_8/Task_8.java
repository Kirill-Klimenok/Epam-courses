package com.company.Task_8;

public class Task_8 {
    private final int[] D;

    public Task_8(int num) {
        this.D = new int[num];
        setD();
    }

    private void setD() {
        for (int i = 0; i < D.length; i++) {
            D[i] = (int) (0 + Math.random() * 100);
        }
    }

    public int[] searchSum(int k, int m) {
        int[] sum = new int[(int) (D.length / 3)];
        int index = 0;

        if ((m - k) % 3 == 0) {
            for (int i = k; i <= m - 1; i += 3) {
                sum[index] = sum(i);
                index++;
            }
        } else {
            for (int i = k; i < m - 1; i += 3) {
                if (m - i >= 3) {
                    sum[index] = sum(i);
                } else {
                    System.err.print("вы ввели промежуток не кратный 3\n невозможно вычислить сумму последних элементов");
                }
            }
        }


        return sum;
    }

    private int sum(int beginning) {
        int sum = 0;
        for (int i = beginning; i < beginning + 1; i++) {
            sum += D[beginning];
        }
        return sum;
    }
}
