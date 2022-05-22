package com.hubin.leetcode;

import java.util.*;

public class Solution_438 {
    public List<Integer> findAnagrams(String s, String p) {
        /*
        List<Integer> list=new ArrayList<>();
        int len=p.length(),left=0,right=left+len-1;
        Set<Character> set=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        char[] chars_p=p.toCharArray();
        char[] chars_s=s.toCharArray();
        int i=0;
        while(i<len){
            set.add(chars_p[i++]);
        }
        while(right<s.length()){
            set2=new HashSet<>(set);
            for(i=left;i<=right;i++){
                if(set2.contains(chars_s[i])){
                    set2.remove(chars_s[i]);
                }else {
                    continue;
                }
            }
            if(set2.isEmpty()){
                list.add(left);
            }
            left++;
            right=left+len-1;
        }
        return list;

         */
        int left = 0, right = 0, len_p = p.length(), len_s = s.length();
        List<Integer> res = new ArrayList<>();
        char[] chars_s = s.toCharArray();
        char[] chars_p = p.toCharArray();
        Map<Character, Integer> map_p = new HashMap<>();
        Map<Character, Integer> map_s = new HashMap<>();
        for (int i = 0; i < chars_p.length; i++) {
            if (map_p.containsKey(chars_p[i])) {
                map_p.put(chars_p[i], map_p.get(chars_p[i]) + 1);
            } else {
                map_p.put(chars_p[i], 1);
            }
        }
        while (right < len_s) {
            if (map_s.containsKey(chars_s[right])) {
                map_s.put(chars_s[right], map_s.get(chars_s[right]) + 1);
            } else {
                map_s.put(chars_s[right], 1);
            }
            if ((right - left + 1 )== len_p) {
                if (map_p .equals(map_s) ) {
                    res.add(left);
                }
                map_s.put(chars_s[left], map_s.get(chars_s[left]) - 1);
                if (map_s.get(chars_s[left]) ==0) {
                    map_s.remove(chars_s[left]);
                }
                left++;
            }
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution_438 solution_438=new Solution_438();
        String s = "baa", p = "aa";
        System.out.println(solution_438.findAnagrams(s,p));
    }
}
