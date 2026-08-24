class Solution {
    public int countCommas(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(i<1000) count+=0;
            else if(i<1000000) count+=1;
            else count+=2;
        }
        return count;
    }
}