package com.company.Task_13;

public class Task_13 {
    private final int N;

    public Task_13(int n) {
        this.N = n;
    }

    public void searchTwins(){
        for(int i=N;i<N*2-2;i++){
            System.out.print(i+" - "+(i+2)+"\n");
        }
    }


}
