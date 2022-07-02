package com.hubin.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;
public class Solution_20 {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');
        char[] chars = s.toCharArray();
        Stack<Character> stack1 = new Stack();
        Stack stack2 = new Stack();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                if (!stack1.empty()&&hashMap.get(chars[i]).equals(stack1.peek())) {
                    stack1.pop();
                } else {
                    stack1.push(chars[i]);
                }
            } else {
                stack1.push(chars[i]);
            }
        }
        return stack1.empty();
    }
    @Test
    public void test(){
        String s="([)]";
        Solution_20 solution_20=new Solution_20();
        System.out.println(solution_20.isValid(s));

    }
}
