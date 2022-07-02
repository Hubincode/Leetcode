package com.hubin.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_47 {
    private List<List<Integer>> res=new LinkedList<List<Integer>>();
    private List<Integer> path=new LinkedList<>();
    private ArrayList<Integer> pathid=new ArrayList<Integer>();
    public List<List<Integer>> permuteUnique(int [] nums) {
        Arrays.sort(nums);
        dfs(nums,nums.length,pathid);
        return res;
    }
    private void dfs(int[]nums,int target,ArrayList<Integer>pathid){
        if(target==path.size()){
            res.add(new LinkedList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(pathid.contains(i)) continue;
            path.add(nums[i]);
            pathid.add(i);
            dfs(nums,nums.length,pathid);
            pathid.remove(pathid.size()-1);
            path.remove(path.size()-1);
            while (((i+1)<nums.length)&&nums[i]==nums[i+1]){
                i++;
            }
        }

    }

//    @Test：把一个方法标记为测试方法
//    @Before：每一个测试方法执行前自动调用一次
//    @After：每一个测试方法执行完自动调用一次
//    @BeforeClass：所有测试方法执行前执行一次，在测试类还没有实例化就已经被加载，所以用static修饰
//    @AfterClass：所有测试方法执行完执行一次，在测试类还没有实例化就已经被加载，所以用static修饰
//    @Ignore：暂不执行该测试方法

    int[] nums1=null;
    @Before
    public  void setup(){
        System.out.println("Before");

        nums1= new int[]{1, 1, 2};
    }
    @After
    public void tearDown() {
        System.out.println("After");
    }
    @Test
    public  void test(){
        System.out.println("Test");
        System.out.println(permuteUnique(nums1));
    }
}
