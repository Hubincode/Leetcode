package com.hubin.leetcode;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.*;

public class Solution_17 {
    Map<Integer, List<String>>map= new  HashMap<>();
    List<String> arrayList=new ArrayList<>();
    List<String> res=new ArrayList();
    public List<String> letterCombinations(String digits) {
        Init();
        return res;

    }
//    //递归函数
//    void iterStr(String str, StringBuilder letter, int index) {
//        //递归的终止条件，注意这里的终止条件看上去跟动态演示图有些不同，主要是做了点优化
//        //动态图中是每次截取字符串的一部分，"234"，变成"23"，再变成"3"，最后变成""，这样性能不佳
//        //而用index记录每次遍历到字符串的位置，这样性能更好
//        if (index == str.length()) {
//            res.add(letter.toString());
//            return;
//        }
//        //获取index位置的字符，假设输入的字符是"234"
//        //第一次递归时index为0所以c=2，第二次index为1所以c=3，第三次c=4
//        //subString每次都会生成新的字符串，而index则是取当前的一个字符，所以效率更高一点
//        char c = str.charAt(index);
//        //map_string的下表是从0开始一直到9， c-'0'就可以取到相对的数组下标位置
//        //比如c=2时候，2-'0'，获取下标为2,letter_map[2]就是"abc"
//        int pos = c - '0';
//        String map_string = letter_map[pos];
//        //遍历字符串，比如第一次得到的是2，页就是遍历"abc"
//        for (int i = 0; i < map_string.length(); i++) {
//            //调用下一层递归，用文字很难描述，请配合动态图理解
//            letter.append(map_string.charAt(i));
//            //如果是String类型做拼接效率会比较低
//            //iterStr(str, letter+map_string.charAt(i), index+1);
//            iterStr(str, letter, index + 1);
//            letter.deleteCharAt(letter.length() - 1);
//        }
//    }

    public void  Init(){
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        map.put(2,arrayList);

        arrayList.clear();
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        map.put(3,arrayList);

        arrayList.clear();
        arrayList.add("g");
        arrayList.add("h");
        arrayList.add("i");
        map.put(4,arrayList);

        arrayList.clear();
        arrayList.add("j");
        arrayList.add("k");
        arrayList.add("l");
        map.put(5,arrayList);

        arrayList.clear();
        arrayList.add("m");
        arrayList.add("n");
        arrayList.add("o");
        map.put(6,arrayList);

        arrayList.clear();
        arrayList.add("p");
        arrayList.add("q");
        arrayList.add("r");
        arrayList.add("s");
        map.put(7,arrayList);

        arrayList.clear();
        arrayList.add("t");
        arrayList.add("u");
        arrayList.add("v");
        map.put(8,arrayList);

        arrayList.clear();
        arrayList.add("w");
        arrayList.add("x");
        arrayList.add("y");
        arrayList.add("z");
        map.put(9,arrayList);

    }

    public static void main(String[] args) {


    }
}
