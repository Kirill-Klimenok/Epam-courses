package com.company;

import com.company.Task_1.Task_1;
import com.company.Task_10.Task_10;
import com.company.Task_2.Task_2;
import com.company.Task_3.Task_3;
import com.company.Task_4.Task_4;
import com.company.Task_5.Task_5;
import com.company.Task_6.Task_6;
import com.company.Task_7.Task_7;
import com.company.Task_8.Task_8;
import com.company.Task_9.Task_9;

public class Main {

    public static void main(String[] args) {
	/*Task 1
	В массив A [N] занесены натуральные числа.
	 Найти сумму тех элементов, которые кратны данному К.
	 */
        Task_1 task_1 = new Task_1(20);
System.out.println();

    /*Task 2
     Дана последовательность действительных чисел а1, а2,…, аn.
     Заменить все ее члены, большие данного Z, этим числом.
    Подсчитать количество замен.*/
        Task_2 task_2 = new Task_2(20, 15);
        System.out.println();

    /*Task 3
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
     */
        Task_3 task_3 = new Task_3(30);
        System.out.println();

    /*Task4
    Даны действительные числа а ,а2,…, аn, Поменять местами наибольший и наименьший элементы.
     */
        Task_4 task_4 = new Task_4(25);
        System.out.println();

    /*Task 5
     Даны целые числа а1, а2,...,аn, . Вывести на печать только те числа, для которых аi > i
     */
        Task_5 task_5=new Task_5(22);
        System.out.println();


        /*Task 6
        Задана последовательность N вещественных чисел.
        Вычислить сумму чисел, порядковые номера которых являются простыми числами.
         */
        Task_6 task_6=new Task_6(5);
        System.out.println();


        /*Task 7
        Даны действительные числа а ,а,,…, а .
         Найти max(a1+a2*n,a2+ a2*n-1,...,an+an+1)
         */
        Task_7 task_7=new Task_7(33);
        System.out.println();


        /*Task 8
       Дана последовательность целых чисел а1 ,а2,...,аn,
        Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1 ,a2,...,an) */
        Task_8 task_8=new Task_8(33);
        System.out.println();


        /*Task 9
       Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
        Примечание. Дополнительный массив не использовать. */
            Task_9 task_9=new Task_9(15);
            System.out.println();



        /*Task 10
       Дана последовательность целых чисел а1 ,а2,...,аn,
        Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1 ,a2,...,an) */
            Task_10 task_10=new Task_10(15);
            System.out.println();
    }
}
