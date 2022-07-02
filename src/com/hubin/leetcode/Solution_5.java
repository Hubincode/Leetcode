package com.hubin.leetcode;

public class Solution_5 {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        String ans="";
        char[] chars=s.toCharArray();
        int len=s.length();
        for(int i=0;i<len;i++){
            int left,right,j=i;
            while((j<len)&&chars[i]==chars[j])
            {j++;}
            ans=s.substring(i,j).length()>ans.length()?s.substring(i,j):ans;
            left=i-1;
            right=j;
//            if (((i+1)<len)&&s.substring(i,i+1).equals(s.substring(i+1,i+2))){
//                left=i-1;
//                right=i+2;
//                ans=s.substring(i,i+2).length()>ans.length()?s.substring(i,i+2):ans;
//            }else {
//                left=i-1;
//                right=i+1;
//                ans=s.substring(i,i+1).length()>ans.length()?s.substring(i,i+1):ans;
//            }
            while((left>=0)&&(right<len) ){
                if((s.substring(left,i)).equals( new StringBuffer(s.substring(j,right+1)).reverse().toString())){
                    ans=s.substring(left,right+1).length()>ans.length()?s.substring(left,right+1):ans;
                }

                left--;
                right++;
            }
        }
        return ans;
    }
    //动态规划
    public String longestPalindrome2(String s) {
        int len=s.length();
        Boolean[][] dp=new Boolean[len][len];
        char[] chars=s.toCharArray();
        int begin=0;
        int lenmax=1;
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        for(int j=1;j<len;j++){
            for (int i=0;i<j;i++){
                dp[i][j]=(chars[i]==chars[j])&&((j-i<3)||dp[i+1][j-1]);
                if(dp[i][j]==true){
                    if(lenmax<(j-i+1))
                    lenmax=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+lenmax);
    }


    public static void main(String[] args) {
        Solution_5 solution_5=new Solution_5();
        String s = "abcba";
        System.out.println(solution_5.longestPalindrome(s));
        System.out.println(solution_5.longestPalindrome2(s));
    }
}
