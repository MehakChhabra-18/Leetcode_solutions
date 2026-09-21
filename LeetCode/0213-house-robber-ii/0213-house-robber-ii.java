class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        if(n==1)
        {
            return nums[0];
        }

        int case1=solve(nums,0,n-2,dp);
        int case2=solve(nums,1,n-1,dp);
        return Math.max(case1,case2);
    }

    public int solve(int[] nums,int start,int end,int[][] dp)
    {
        if(start>end) return 0;
        if(dp[start][end]!=-1) return dp[start][end];
        int skip=solve(nums,start+1,end,dp);
        int take=nums[start]+solve(nums,start+2,end,dp);
        return dp[start][end]=Math.max(skip,take);
    }



}