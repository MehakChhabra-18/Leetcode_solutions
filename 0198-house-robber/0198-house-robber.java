class Solution {
    int[] dp;
    public int solve(int[] nums,int idx)
    {
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int steal=nums[idx]+solve(nums,idx+2);
        int skip=solve(nums,idx+1);
        return dp[idx]=Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        }

        int ans=solve(nums,0);
        return ans;

    }
}