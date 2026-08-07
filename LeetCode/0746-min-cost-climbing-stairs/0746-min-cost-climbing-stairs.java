class Solution {
    int[] dp;
    public int solve(int[] cost,int idx)
    {
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int total=solve(cost,idx+1);
        int total1=solve(cost,idx+2);
        return dp[idx]=cost[idx]+Math.min(total,total1);
    }
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0),solve(cost,1));
    }
}