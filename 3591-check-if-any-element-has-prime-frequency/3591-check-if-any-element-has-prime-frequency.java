class Solution {
    public boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int x:map.keySet())
        {
            if(isPrime(map.get(x)))
            {
                return true;
            }
        }

        return false;
    }
}