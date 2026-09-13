class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        int n=nums.length;
        int val=nums[n/2];
        for(int num:nums)
        {
            if(num==val) count++;
            if(count>1) return false;
        }

        return true;
    }
}