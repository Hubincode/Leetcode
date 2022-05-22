package com.hubin.niuke;

import org.junit.Test;

public class NC105 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 如果目标值存在返回下标，否则返回 -1
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        // write code here
        int low=0,high= nums.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                while((mid>0)&&nums[mid-1]==target){
                    mid--;
                }
                return mid;
            }
            if(target<nums[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;

    }
    public int search2 (int[] nums, int low,int high,int target) {
        // write code here
        int mid=(low+high)/2;
        if(low>high) {
            return -1;
        }
        if(nums[mid]==target){
            while((mid>0)&&nums[mid-1]==target){
                mid--;
            }
            return mid;
        }
        if(nums[mid]>target){
           return search2(nums,low,mid-1,target);
        }
        if(nums[mid]<target){
            return search2(nums,mid+1,high,target);
        }
        return -1;
    }
    @Test
    public void test(){
        int[] nums={1,2,3,4,5};
        int target=0;
        System.out.println(search(nums,target));
        System.out.println(search2(nums,0,nums.length-1,target));
    }
}
