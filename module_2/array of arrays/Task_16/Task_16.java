package com.company.Task_16;



public class Task_16 {
    public Task_16(int n) {
        if (n <= 2 ) {
            System.err.print("вы ввели число, которое меньше 2");
        }
        else{
            int[][] mass = new int[n][n];


            int row = 0;
            int column = n / 2;

            if (n % 4 > 0) {
                getOddSquare(n, mass, row, column);
                printArray(mass);
            } else {
                generateArray(mass);
                reverseArray1(mass);
                reverseArray2(mass);
                printArray(mass);
            }

        }
    }

    public static void printArray(int[][] magicSquare) {
        for (int[] ints : magicSquare) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void generateArray(int[][] magicSquare) {
        int k = 1;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                magicSquare[i][j] = k;
                k++;
            }
        }
    }

    public static void reverseArray1(int[][] mass) {
        int t;
        for (int i = 0; i < mass.length / 2; i++) {
            for (int j = 0; j < mass.length / 2; j++) {
                if (i == j) {
                    t = mass[i][j];
                    mass[i][j] = mass[mass.length - 1 - i][mass.length - 1 - j];
                    mass[mass.length - 1 - i][mass.length - 1 - j] = t;
                }
            }
        }
    }

    public static void reverseArray2(int[][] mass) {
        int t;
        for (int i = 0, j = mass.length - 1 - i; i <= (mass.length / 2) - 1; ++i, --j) {
            t = mass[i][j];
            mass[i][j] = mass[j][i];
            mass[j][i] = t;
        }
    }

    private static void getOddSquare(int n, int[][] mass,  int row, int column) {
        int number = 1;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            mass[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (mass[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
    }
}
