package com.hubin.leetcode;

import org.junit.Test;

import java.sql.Array;
import java.util.*;

public class Solution_mianshi10_02 {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> str2=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] cha = strs[i].toCharArray();
            Arrays.sort(cha);
            String str=String.valueOf(cha);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }else {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }
        }
        List<List<String>> listres=new ArrayList<>();
        for(String str:map.keySet()){
            listres.add(map.get(str));
        }
        return listres;
    }
    @Test
    public void test(){
        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }
}
