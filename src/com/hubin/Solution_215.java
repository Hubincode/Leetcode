//package com.hubin;
//
//import javafx.scene.effect.SepiaTone;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Solution_215 {
//    public int findKthLargest(int[] nums, int k) {
//        Set<Integer> set=new HashSet<Integer>();
//        int min=nums[0];
//        for(int i=0;i<nums.length;i++){
//            if(set.size()<k){
//                set.add(nums[i]);
//                min=Math.min(nums[i],min);
//            }
//            else {
//                if(nums[i]>min){
//                    set.remove(min);
//
//                }
//            }
//        }
//
//    }
//}
