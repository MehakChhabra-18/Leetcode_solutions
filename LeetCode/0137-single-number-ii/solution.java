class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        int ans=Integer.MIN_VALUE;
        for(int x:map.keySet())
        {
            if(map.get(x)==1)
            {
                ans=x;
            }
        }
        
        return ans;
    }
}
