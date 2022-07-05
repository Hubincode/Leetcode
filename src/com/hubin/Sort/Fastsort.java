package com.hubin.Sort;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fastsort {
    void Fastsort(int left,int right,int[]arr){
        if(left>=right){
            return;
        }
        int i=left,j=right;
        if(left<right){
            int temp=arr[left];
            while(i<j){
                while(i<j&&arr[j]>=temp) j--;
                arr[i]=arr[j];
                while (i<j&&arr[i]<=temp) i++;
                arr[j]=arr[i];

            }
            arr[i]=temp;
        }
        this.Fastsort(0,i-1,arr);
        this.Fastsort(i+1,right,arr);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList arrayList=new ArrayList();
        arrayList.clear();
        while (scanner.hasNext()){
            arrayList.add(scanner.nextLine());
        }
        System.out.print(Arrays.toString(arrayList.toArray()));
        Fastsort fastsort=new Fastsort();
        int[] arr=new int[255];
        for(int i=0;i<arrayList.size();i++){
            arr[i]=Integer.valueOf(arrayList.get(i).toString());
        }
        fastsort.Fastsort(0,arr.length-1,arr);
        System.out.print(Arrays.toString(arr));
    }


}
