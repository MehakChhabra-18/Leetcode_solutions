class Solution {
    public int solve(int k,int n,int length)
    {
        if(n==0)
        {
           return length;
        }
        n = (n * 10 + 1) % k;
        return solve(k,n,length+1);
    }
    public int minAllOneMultiple(int k) {
        if(k % 2 == 0 || k % 5 == 0) return -1;

        return solve(k,1,1);
    }
}