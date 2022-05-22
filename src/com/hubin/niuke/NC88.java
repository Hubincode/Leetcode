package com.hubin.niuke;

public class NC88 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return Quicksort(a,0,a.length-1,K);
    }
    public int Quicksort(int[] a, int start, int end,int K){
        int i=start,j=end;
        int base=a[i];
        while(i<j){
            while (i<j&&a[j]<=base) {
                j--;
            }
            a[i]=a[j];
            while (i<j&&a[i]>=base) {
                i++;
            }
            a[j]=a[i];
        }
        a[i]=base;
        int res = 0;
        if(i+1==K) {
            return a[i];
        }
        else if (i+1 > K) {
            res = Quicksort(a, start, i-1, K);
        } else if (i+1 < K) {
            res = Quicksort(a, i+1, end, K);
        }
        return res;
    }

}
