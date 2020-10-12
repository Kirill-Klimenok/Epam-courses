package com.company;

import com.company.Task_1.Task_1;
import com.company.Task_10.Task_10;
import com.company.Task_11.Task_11;
import com.company.Task_12.Task_12;
import com.company.Task_13.Task_13;
import com.company.Task_14.Task_14;
import com.company.Task_15.Task_15;
import com.company.Task_16.Task_16;
import com.company.Task_17.Task_17;
import com.company.Task_2.Task_2;
import com.company.Task_3.Task_3;
import com.company.Task_4.Task_4;
import com.company.Task_5.Task_5;
import com.company.Task_6.Task_6;
import com.company.Task_7.Task_7;
import com.company.Task_8.Task_8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*Task 1

         */
        Task_1 task_1 = new Task_1(126, 70);


        /*Task 2

         */
        Task_2 task_2 = new Task_2(20, 18, 26, 48);


        /*Task 3

         */
        Task_3 task_3 = new Task_3(3);
        task_3.square();


        /*Task 4

         */
        Task_4 task_4 = new Task_4(4);


        /*Task 5

         */
        Task_5 task_5 = new Task_5(3);


        /*Task 6

         */
        Task_6 task_6 = new Task_6(3, 7, 13);
        task_6.getInfoAboutNumberst();
        task_6.print();


        /*Task 7

         */
        Task_7 task_7 = new Task_7();
        task_7.sumFactorial();


        /*Task 8

         */
        Task_8 task_8 = new Task_8(9);
        System.out.println(Arrays.toString(task_8.searchSum(0, 9)));


        /*Task 9

         */



        /*Task 10

         */
        Task_10 task_10 = new Task_10(123586516);
        System.out.println(Arrays.toString(task_10.setMass()));


        /*Task 11

         */
        Task_11 task_11 = new Task_11(38, 1101);
        System.out.println(task_11.moreNumbers());
        /*Task 12

         */
        Task_12 task_12 = new Task_12(6, 50);
        task_12.setMass();


        /*Task 13

         */
        Task_13 task_13=new Task_13(10);
        task_13.searchTwins();


        /*Task 14

         */
        Task_14 task_14=new Task_14(1000);
        task_14.enumeration();
        task_14.print();


        /*Task 15

         */
        Task_15 task_15 = new Task_15(5);
        task_15.enumeration();
        task_15.print();


        /*Task_16

         */
        Task_16 task_16 = new Task_16(5);
        task_16.enumeration();
        task_16.print();
        System.out.println(task_16.numbersOfOdd());
        /*Task 17

         */
        Task_17 task_17 = new Task_17(999);
        System.out.println(task_17.subtraction());
    }
}
