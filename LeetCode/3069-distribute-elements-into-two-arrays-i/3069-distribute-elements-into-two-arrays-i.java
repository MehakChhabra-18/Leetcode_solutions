class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int last1=arr1[0];
        int last2=arr2[0];
        int k1=1,k2=1;
        for(int i=2;i<nums.length;i++)
        {
            if(last1>last2)
            {
                arr1[k1++]=nums[i];
                last1=nums[i];
                
            }

            else
            {
                arr2[k2++]=nums[i];
                last2=nums[i];
                
            }
        }

        int[] merged=new int[nums.length];
        int k=0;
        for(int i=0;i<k1;i++)
        {
            merged[k++]=arr1[i];
        }

        for(int i=0;i<k2;i++)
        {
            merged[k++]=arr2[i];
        }

        return merged;

    }
}