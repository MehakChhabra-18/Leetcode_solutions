class Solution {
    int[][] dp;
    public int solve(int[][] obstacleGrid,int m,int n,int row,int col)
    {
        if(row>=m || col>=n) return 0;
        if(obstacleGrid[row][col]==1) return 0;
        if(row==m-1 && col==n-1) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        return dp[row][col]=solve(obstacleGrid,m,n,row+1,col)+solve(obstacleGrid,m,n,row,col+1);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        return solve(obstacleGrid,m,n,0,0);

        
    }
}