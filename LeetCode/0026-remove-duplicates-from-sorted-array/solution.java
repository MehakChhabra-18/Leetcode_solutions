class Solution {
    public int removeDuplicates(int[] nums) {
        int len =nums.length;
        int[] seen= new int[len];
        int[] result=new int[len];
        for(int i=0;i<len;i++)
        {
            seen[i]=0;
        }

        int k=0;
        for(int i=0;i<len;i++)
        {  
            if(seen[i]==1)continue;
            for(int j=1;j<len;j++)
            {
                if(nums[i]==nums[j])
                {
                    seen[j]=1;
                }
            }
            nums[k++]=nums[i];
        }

        return k; 
    }
}
