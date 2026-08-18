class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==1)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int x:nums)
            {
                map.put(x,map.getOrDefault(x,0)+1);
            }

            int ans=-1;
            for(int x:map.keySet())
            {
                if(map.get(x)==1) ans=Math.max(ans,x);
            }

            return ans;
        }

        if(k==n)
        {
            int max=Integer.MIN_VALUE;
            for(int x:nums)
            {
                max=Math.max(x,max);
            }

            return max;
        }

        int ans=-1;
        int first=nums[0];
        int last=nums[n-1];
        int firstCount=0;
        int lastCount=0;
        for(int x:nums)
        {
            if(x==first) firstCount++;
            if(x==last) lastCount++;
        }

        if(firstCount==1) ans=Math.max(ans,first);
        if(lastCount==1) ans=Math.max(ans,last);

        return ans;
    }
}