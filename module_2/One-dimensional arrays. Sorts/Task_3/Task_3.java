package com.company.Task_3;

/*Сортировка выбором. Дана последовательность чисел а1<=a2<=...<=an, .Требуется переставить элементы так,
        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
        элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго,
        эта процедура повторяется. Написать алгоритм сортировки выбором.
*/
public class Task_3 {
    private int[] mass;

    public Task_3(int n) {
        this.mass = new int[n];
    }

    public void setMass() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 2;
        }
    }

    public void sorting() {
        for (int i = 0; i < mass.length; i++) {    // i - номер текущего шага
            int pos = i;
            int max = mass[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] > max) {
                    pos = j;    // pos - индекс наименьшего элемента
                    max = mass[j];
                }
            }
            mass[pos] = mass[i];
            mass[i] = max;    // меняем местами наименьший с array[i]
        }

    }
    public void print(){
        System.out.println();
        for(int i=0;i< mass.length;i++){
            System.out.print(mass[i]+" ");
        }
    }

}


