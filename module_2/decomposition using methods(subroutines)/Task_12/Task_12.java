package com.company.Task_12;

public class Task_12 {
    private final int K;
    private final int N;
    private final int[] A;

    public Task_12(int k, int n) {
        this.A=new int[n];
        this.K = k;
        this.N = n;
    }


    public void setMass() {
        int k=0;
        for (int i = 10; i < N; i++) {
            if ((i % 10 + i / 10) == K) {
                A[k]=i;
                k++;
            }
        }
        printMassA(k);
    }
    public void printMassA(int k){
        for(int i =0;i<k;i++){
            System.out.print(A[i]+" ");
        }
    }
}
