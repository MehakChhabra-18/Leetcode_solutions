class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int count=1;
        int maxLen=1;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
              if(nums[i]==nums[i-1]) continue;
              else if(nums[i]==nums[i-1]+1) count++;
              else count=1;
              maxLen=Math.max(maxLen,count);
        }
        return maxLen;
    }
}
