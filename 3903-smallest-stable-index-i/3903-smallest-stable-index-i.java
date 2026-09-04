class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int max = -1;
        int n = nums.length;
        int[] min = new int[n];
        min[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            min[i] = Math.min(nums[i], min[i+1]);
        }
        for(int i=0; i<nums.length;i++){
            max = Math.max(nums[i], max);
            int score = max - min[i];
            if(score <= k) return i;
        }
        return -1;
        
    }
}