class Solution {
    public int count(int i,int j,int n,int m,int [][]dp){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i>=n || j>=m || j<0 || i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int right=count(i,j+1,n,m,dp);
        int down=count(i+1,j,n,m,dp);
        return dp[i][j]=right+down;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return count(0,0,m,n,dp);
    }
}