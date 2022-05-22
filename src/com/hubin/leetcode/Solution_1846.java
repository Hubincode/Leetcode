package com.hubin.leetcode;

import org.junit.Test;

import java.util.Arrays;


public class Solution_1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=1) {
            arr[0]=1;
        }
        for(int j=1;j<arr.length;j++){
            if(Math.abs(arr[j]-arr[j-1])<2){
                continue;
            }else {
                arr[j]=arr[j-1]+1;
            }
        }


        int i= Arrays.stream(arr).max().getAsInt();
        return i;
    };
    @Test
    public void test(){
        int[] arr={100,1,1000};
        int a=maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println(a);
    }
}
