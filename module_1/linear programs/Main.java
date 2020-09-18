package com.company;

import com.company.Task_1.Task_1;
import com.company.Task_2.Task_2;
import com.company.Task_3.Task_3;
import com.company.Task_4.Task_4;
import com.company.Task_5.Task_5;
import com.company.Task_6.Task_6;

public class Main {

    public static void main(String[] args) {
        /*Task 1
        Найт значение функции
        z = ( ( a - 3 ) * b / 2 ) + c
        */
        Task_1 task_1 = new Task_1();
        System.out.println(task_1.getZ(4.556, 2.887, 0.8));


        /*Task 2
        Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        (((b + sqrt(b^2 + 4 * a * c)) / 2 * a) -a^3 * c +b(^-2))
         */
        Task_2 task_2 = new Task_2();
        System.out.println(task_2.getResult(2.568,8.465,1.45648));


        /*Task 3
         Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        ( ( (sin(x) + cos(y)) / cos(x) - sin(y) ) * tg(x*y) \)
         */
        Task_3 task_3=new Task_3();
        System.out.println(task_3.getResult(2.46588,9.13546));


        /*Task 4
        Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях)ю
        Поменять местами дробную и целую части числа и вывести полученное значение числа.
        */
        Task_4 task_4=new Task_4();
        System.out.println(task_4.setNum(123.444));


        /*Task 5
        Дано натуральное число T, которые представляет собой длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минута и секундах форме HHч ММмин SSc.
        */
        Task_5 task_5=new Task_5();
        task_5.getTime( 20000);


        /*Task 6
        для данной области составить линейнуб программу, которая печатает true, если точка с координатами (x.y)
        принадлежит закрашенной области, и false- в противном случае
        x - [-4;4]  y -[-3;4]
         */
        Task_6 task_6=new Task_6();
        System.out.println(task_6.chart(3,5));

    }
}
