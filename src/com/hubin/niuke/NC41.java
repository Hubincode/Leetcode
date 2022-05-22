package com.hubin.niuke;

import java.util.HashSet;
import java.util.Set;

public class NC41 {
    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        Set<Integer> setres=new HashSet<>();
        int res=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                }else {
                    res=res>set.size()?res:set.size();
                }
            }
            set.clear();

        }
        return res;
    }
}

