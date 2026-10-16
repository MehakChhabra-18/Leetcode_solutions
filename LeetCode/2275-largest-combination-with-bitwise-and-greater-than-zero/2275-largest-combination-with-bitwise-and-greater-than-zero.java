class Solution {
    public int largestCombination(int[] candidates) {
        int[] count=new int[31];
        int ans=0;
        for(int num:candidates)
        {
            for(int bit=0;bit<31;bit++)
            {
                if((num&(1<<bit))!=0)
                {
                    count[bit]++;
                }
            }
        }

        for(int c:count)
        {
            ans=Math.max(ans,c);
        }
        
        return ans;
    }
}