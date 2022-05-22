package com.hubin.niuke;

import java.util.ArrayList;
import java.util.Arrays;

public class NC119 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
