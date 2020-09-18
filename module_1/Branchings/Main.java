package com.company;

import com.company.Task_1.Task_1;
import com.company.Task_2.Task_2;
import com.company.Task_3.Task_3;
import com.company.Task_4.Task_4;
import com.company.Task_5.Task_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Даны 2 угла треугольника (в градусах )
        Определить, существует ли такой треугольник,
        есди да,то будет ли он прямоугольным*/
        Task_1 task_1 = new Task_1();
        task_1.SetA1A2(30, 60);


        /*Task 2
        Найти max{min(a,b),min(c,d)}.
         */
        Task_2 task_2 = new Task_2();
        task_2.min(3, 5, 4, 9);


        /*Task 3
        Даны 3 точки. Определить будут ли они лежать на одной прямой
        */
        Task_3 task_3 = new Task_3();
        System.out.println(task_3.setX1Y1Y2X2Y3X3(3, -7, -5, 4, 27, -40));


        /*Task 4
        Заданы размеры А , В прямоугольного отверстия и размеры x,y,z, кирпичв.
         Определить , пройдёт ли кирпич через отверстие */
        Task_4 task_4 = new Task_4(3, 4);
        task_4.setSize(3, 3, 3);


        /* Task 5
        Вычислить значения функции
        F(x)={x^2-3*x+9, если x <= 3;
             {1/(x^3+6), ecли x > 3;
         */
        Scanner x = new Scanner(System.in);
        double x_1;
        x_1 = x.nextDouble();
        Task_5 task_5 = new Task_5(x_1);
        task_5.funkF();

    }
}
