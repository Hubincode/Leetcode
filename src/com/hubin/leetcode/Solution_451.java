package com.hubin.leetcode;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

import static java.util.Map.Entry.comparingByValue;

public class Solution_451 {
    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        char c;
        int lenth=s.length();
        while(lenth>0){
            if(map.containsKey(s.charAt(lenth-1))){
                map.put(s.charAt(lenth-1),map.get(s.charAt(lenth-1))+1);
            }else{
                map.put(s.charAt(lenth-1),1);
            }
            lenth--;

        }
//        Comparator<Map.Entry<Character, Integer>> valueComparator = new Comparator<Map.Entry<Character,Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o1.getValue()-o2.getValue();;
//            };
//        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());

        // 排序
        Map<Character, Integer> sorted = map
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));


        String res="";

        for (Character so :sorted.keySet()){
            Integer num=sorted.get(so);
            for (Integer i=0;num>i;i++){
                res=so+res;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String s="tree";
        frequencySort(s);
    }
}