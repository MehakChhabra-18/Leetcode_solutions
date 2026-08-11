class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> positives=new LinkedList<>();
        Queue<Integer> negatives=new LinkedList<>();
        for(int x:nums)
        {
            if(x>=0) positives.add(x);
            else negatives.add(x);
        }

        for(int i=0;i<nums.length;)
        {
            if(positives.size()!=0)
            {
            nums[i++]=positives.remove();
            }

            if(negatives.size()!=0)
            {
              nums[i++]=negatives.remove();
            }
        }

        return nums;
        
    }
}