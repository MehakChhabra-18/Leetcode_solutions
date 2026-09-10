class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFreq=0;
        int ans=-1;
        for(int x:map.keySet())
        {
            if(x%2==0)
            {
                if(map.get(x)>maxFreq)
                {
                    maxFreq=map.get(x);
                    ans=x;
                }
                else if(map.get(x) == maxFreq && x < ans) {
                    ans = x;
                }
            }
        }

        return ans;
    }
}