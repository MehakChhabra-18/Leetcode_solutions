class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> q=new LinkedList<>();
        for(int x:nums)
        {
            if(x!=0) q.add(x);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!q.isEmpty()) 
            {
                nums[i]=q.remove();
            }
            else
            {
                nums[i]=0;
            }
        }   
    }
}
