package com.hubin.leetcode;

public class Solution_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        if(obstacleGrid[m-1][n-1]==1||obstacleGrid[0][0]==1){
            return 0;
        }
        dp[0][0]=1;
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]==1){
                dp[i][0]=0;
            }else{
                dp[i][0]=dp[i-1][0];
            }
        }
        for(int j=1;j<n;j++){
            if(obstacleGrid[0][j]==1){
                dp[0][j]=0;
            }else{
                dp[0][j]=dp[0][j-1];
            }
        }
        for(int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if((obstacleGrid[i-1][j]==1)&&(obstacleGrid[i][j-1]==1)){
                    dp[i][j]=0;
                }else if(obstacleGrid[i-1][j]==1){
                    dp[i][j]=dp[i][j-1];
                }else if(obstacleGrid[i][j-1]==1){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }

            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid={
                {0,0},
                {1,1},
                {0,0},
        };
        Solution_63 solution_63=new Solution_63();
        System.out.println(solution_63.uniquePathsWithObstacles(obstacleGrid));
    }
}
