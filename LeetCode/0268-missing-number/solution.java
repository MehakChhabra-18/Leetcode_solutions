class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int xor=0;
        // for(int i=0;i<=n;i++)
        // {
        //     xor=xor^i;
        // }

        // int xor1=0;
        // for(int i=0;i<n;i++)
        // {
        //      xor=xor^nums[i];
        // }

        // return xor^xor1;

        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int sum1=0;
        for(int i=0;i<=n;i++)
        {
            sum1+=i;
        }
        return sum1-sum;
        
    }
}
