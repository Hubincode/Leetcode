package com.hubin.niuke;

import java.util.Vector;

public class NC22 {
    public void merge(int A[], int m, int B[], int n) {
        for(int i=0;i<B.length;i++){
            A[A.length-i-1]=B[i];
        }
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }


    }
}
