class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            min=Math.min(min,num);
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int[] ans=new int[2];
        ans[0]=min;
        int newMin=Integer.MAX_VALUE;
        for(int num:map.keySet())
        {
            if(map.get(num)!=map.get(min))
            {
                if(num<newMin)
                {
                    newMin=num;
                }
            }
        }

        if (newMin == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        ans[1] = newMin;
        return ans;


    }
}