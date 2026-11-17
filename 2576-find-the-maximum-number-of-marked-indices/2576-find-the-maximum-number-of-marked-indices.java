class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
       Arrays.sort(nums);
       int i=0,j=(nums.length)/2;
       int count =0;
       while(i<nums.length/2 && j<nums.length)
       {
           if(2*nums[i]<=nums[j])
           {
              count+=2;
              i++;
              j++;
           }    

           else
           {
               j++;
           }
       }
        return count;
    }
}