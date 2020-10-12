package com.company.Task_10;

public class Task_10 {

    private int[][] mass;


    public Task_10(int num) {
        this.mass = new int[num][num];

    }

    public void setMass() {


        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                mass[j][i] = (int) (-10 + Math.random() * 10);
            }
        }
    }



    public  void print() {
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass[0].length; i++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void getPositiveElOfGeneralDiagonals(){
        for(int j=0;j< mass.length-1;j++){
            if(mass[j][j]>0){
                returnPositivChislo(mass[j][j]);
            }

        }
    }
    private int returnPositivChislo(int a){
        return a;
    }
}
