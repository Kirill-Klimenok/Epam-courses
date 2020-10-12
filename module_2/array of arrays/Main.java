package com.company;

import com.company.Task_1.Task_1;
import com.company.Task_10.Task_10;
import com.company.Task_11.Task_11;
import com.company.Task_12.Task_12;
import com.company.Task_13.Task_13;
import com.company.Task_14.Task_14;
import com.company.Task_15.Task_15;
import com.company.Task_16.Task_16;
import com.company.Task_2.Task_2;
import com.company.Task_3.Task_3;
import com.company.Task_4.Task_4;
import com.company.Task_5.Task_5;
import com.company.Task_6.Task_6;
import com.company.Task_7.Task_7;
import com.company.Task_8.Task_8;
import com.company.Task_9.Task_9;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    /*Task 1
	Дана матрица. Вывести на экран все нечетные столбцы,
	 у которых первый элемент больше последнего.
	 */
        Task_1 task_1 = new Task_1(4, 8);


    /*Task 2
     Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/
        Task_2 task_2 = new Task_2(3);


    /*Task 3
    Дана матрица. Вывести k-ю строку и р-й столбец матрицы.
     */
        Task_3 task_3 = new Task_3(3, 4, 1, 2);


    /*Task4
    Сформировать квадратную матрицу порядка п по заданному образцу(п - четное):
     */
        Task_4 task_4 = new Task_4(4);


    /*Task 5
     Сформировать квадратную матрицу порядка п по заданному образцу(п - четное):
     */
        Task_5 task_5 = new Task_5(8);



        /*Task 6
        Сформировать квадратную матрицу порядка п по заданному образцу(п - четное):
         */
        Task_6 task_6 = new Task_6(6);



        /*Task 7
        Сформировать квадратную матрицу порядка N по правилу:
        A[I][J]=sin((I^2-J^2)/N)
        и подсчитать количество положительных элементов в ней.
         */
        Task_7 task_7 = new Task_7(4);
        task_7.setMass();



        /*Task 8
       В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        пользователь с клавиатуры. */
        Task_8 task_8 = new Task_8(5, 6);
        task_8.setMass();
        task_8.setSt_1St_2(1, 3);
        task_8.permutation();



        /*Task 9
       Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
       Определить, какой столбец содержит максимальную сумму. */
        Task_9 task_9 = new Task_9(5, 6);
        task_9.setMass();
        task_9.summElementsStl();




        /*Task 10
       Найти положительные элементы главной диагонали квадратной матрицы. */
        Task_10 task_10 = new Task_10(4);
        task_10.setMass();



        /*Task 11
	Матрицу 10х20 заполнить случайными числами от 0 до 15.
	Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.
	 */
        Task_11 task_11 = new Task_11(10, 20);
        task_11.setMass();
        task_11.sorting();

    /*Task 12
     Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
        Task_12 task_12 = new Task_12(3, 5);
        task_12.setMass();
        task_12.sortingStrOver();
        task_12.sortingStrLess();


    /*Task 13
    Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
     */
        Task_13 task_13 = new Task_13(5, 6);
        task_13.setMass();
        task_13.sortingStlOver();
        task_13.sortingStlLess();


    /*Task 14
    Сформировать случайную матрицу m* n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
     */
        Task_14 task_14 = new Task_14(9,6);
        task_14.setMass();



    /*Task 15
     Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
     */
        Task_15 task_15 = new Task_15(3,5);
        task_15.setMass();
        task_15.changeOdds();




        /*Task 16
       Магическим квадратом порядка п называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3..n^2 так, что суммы по каждому столбцу,
        каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3
         */
        Scanner in = new Scanner(System.in);
        System.out.println("введите размерность матрицы:  ");
        int n = in.nextInt();
        Task_16 task_16=new Task_16(n);



    }
}
