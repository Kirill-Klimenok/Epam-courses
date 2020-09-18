package com.company;

import com.company.Task_1.Task_1;
import com.company.Task_2.Task_2;
import com.company.Task_3.Task_3;
import com.company.Task_4.Task_4;
import com.company.Task_5.Task_5;
import com.company.Task_6.Task_6;
import com.company.Task_7.Task_7;
import com.company.Task_8.Task_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Task 1
        Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Task_1 task_1 = new Task_1();
        task_1.factorial(num);


        /*Task 2
        Вычислить значения функции на отрезке [a,b] с шагом h:
        y={x,x>2
          {-x,x<=2
         */
        Task_2 task_2 = new Task_2();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        task_2.functionValue(a, b, h);


        /*Task 3
        Найдите сумму первых ста чисел
         */
        Task_3 task_3=new Task_3();
        task_3.summ();
        /*Task 4
        составить программу нахождения квадратов первых двухсот чисел
         */
        Task_4 task_4=new Task_4();
        task_4.multiply();


        /*Task 5
        Даны числовой ряд и некоторое число е.
        Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
        Общий член ряда имеет вид:
         */
        Task_5 task_5=new Task_5();
        task_5.setnum(10);
        System.out.println(task_5.summ(0.0056));


        /*Task 6
        Вывести на экран соответсвий между символами и их численными обозначениями в памяти компьютера*/
        Task_6 task_6=new Task_6();
        task_6.getAscii();


        /*Task 7
        Для каждого натурального числа в промежутке от т до п вывести все делители,
         кроме единицы и самого числа
         */
        Task_7 task_7=new Task_7();
        int m,n;
        m=scanner.nextInt();
        n=scanner.nextInt();
        task_7.del(m,n);


        /*Task 8
        Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
         */
        Task_8 task_8=new Task_8();
        task_8.setNums(1234,54721);
    }
}
