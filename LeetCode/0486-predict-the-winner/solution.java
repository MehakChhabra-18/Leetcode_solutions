class Solution {
    int[][] dp=new int[21][21];
    public int solve(int i,int j,int[] nums)
    {
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int take_i=nums[i]+Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int take_j=nums[j]+Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));
        return dp[i][j]=Math.max(take_i,take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int total_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            total_sum+=nums[i];
        }

        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int player1=solve(0,nums.length-1,nums);
        int player2=total_sum-player1;
        if(player1>=player2) return true;
        return false;

        
    }
}
