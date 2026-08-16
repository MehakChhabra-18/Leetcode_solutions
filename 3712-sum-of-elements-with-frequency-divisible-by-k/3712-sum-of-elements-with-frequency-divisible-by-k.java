class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int sum=0;
        for(int x:map.keySet())
        {
            if(map.get(x)%k==0)
            {
                int freq=map.get(x);
                while(freq-->0)
                {
                    sum+=x;
                }
            }
        }

        return sum;
        
    }
}