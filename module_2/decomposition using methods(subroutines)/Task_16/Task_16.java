package com.company.Task_16;

public class Task_16 {
    private int num;
    private int sequenceNums;

    public Task_16(int n) {
        this.sequenceNums = 0;
        this.num = n;
        int[] mass = new int[n];
        String st = "";

        for (int el :
                mass) {
            st += 1;
        }

        num = Integer.parseInt(st);


    }

    public void enumeration() {
        int index = 0;
        for (int i = num; i < num * 9; i += 2) {
            if (searchOddNum(i)) {
                sequenceNums += i;
            }
        }
    }

    private boolean searchOddNum(int i) {
        char[] num;
        num = Integer.toString(i).toCharArray();
        boolean is = false;
        int[] mass = new int[num.length];
        int index = 0;

        for (char k :
                num) {
            mass[index] = Integer.parseInt(String.valueOf(k));
            index++;
        }

        for (int j = 0; j < mass.length - 1; j++) {
            if (mass[j] % 2 != 0) {
                is = true;
            } else {
                is = false;
                break;
            }
        }


        return is;
    }

    public void print() {
        System.out.println(sequenceNums);
    }

    public int numbersOfOdd() {
        int[] numbers = new int[String.valueOf(sequenceNums).length()];
        char[] num;
        num = Integer.toString(sequenceNums).toCharArray();
        int number;
        int counter = 0;
        for (char ch :
                num) {
            number = Integer.parseInt(String.valueOf(ch));
            if (number % 2 != 0 && number != 0) {
                counter++;
            }

        }
        return counter;
    }
}
