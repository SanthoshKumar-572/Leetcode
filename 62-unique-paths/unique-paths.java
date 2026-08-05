class Solution {
    public int uniquePaths(int m, int n) {
       int [][]dp=new int[m][n];
       return  search(m-1,n-1,dp);
    }
    public static int search(int row,int col,int [][]dp){
        if(col==0 || row==0){
            return 1;
        }
        if( dp[row][col] != 0){
           return  dp[row][col];
        }
       dp[row][col]= search(row-1,col,dp)+search(row,col-1,dp);
       return dp[row][col];
    }
}