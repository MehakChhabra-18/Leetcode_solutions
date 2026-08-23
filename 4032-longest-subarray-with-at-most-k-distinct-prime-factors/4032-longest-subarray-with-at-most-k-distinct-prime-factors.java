class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,ans=0;
        for(int right=0;right<nums.length;right++)
            {
                for(int p:primeFactors(nums[right]))
                    {
                        map.put(p,map.getOrDefault(p,0)+1);
                    }

                while(map.size()>k)
                    {
                        for(int p:primeFactors(nums[left]))
                            {
                                map.put(p,map.get(p)-1);
                                if(map.get(p)==0) map.remove(p);
                            }
                        left++;
                    }

                ans=Math.max(ans,right-left+1);
            }
        return ans;
    }

    public List<Integer> primeFactors(int n)
    {
        List<Integer> factors=new ArrayList<>();
        for(int p=2;p*p<=n;p++)
            {
                if(n%p==0) factors.add(p);
                while(n%p==0)
                    {
                        n/=p;
                    }
            }

        if(n>1)
        {
            factors.add(n);
        }
        return factors;
    }
}