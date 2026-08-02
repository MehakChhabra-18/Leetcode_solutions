class Solution {
    
    int[][] t = new int[501][501];

    public int solve(int i,int j,int[] piles)
    {
        if(i>j) return 0;
        if(t[i][j]!=-1) return t[i][j];
        int take_i=piles[i]+Math.min(solve(i+2,j,piles),solve(i+1,j-1,piles));
        int take_j=piles[j]+Math.min(solve(i+1,j-1,piles),solve(i,j-2,piles));
        return t[i][j]=Math.max(take_i,take_j);
    }
    public boolean stoneGame(int[] piles) {
       int n=piles.length;
       int sum_total=0;
       for(int i=0;i<501;i++)
       {
           Arrays.fill(t[i],-1);
       }
       for(int i=0;i<n;i++)
       {
        sum_total+=piles[i];
       }

       int sum_Alice=solve(0,n-1,piles);
       return (sum_Alice > sum_total/2);
        
    }
}
