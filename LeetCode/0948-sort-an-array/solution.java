class Solution {
    public static void divide(int[] nums,int start,int end)
    {
        if(start>=end) return;
        int mid=(start+end)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        conquer(nums,start,mid,end);
    }

    public static void conquer(int[] nums,int start,int mid,int end)
    {
        int[] merged=new int[end-start+1];
        int i=start,j=mid+1;
        int k=0;
        while(i<=mid && j<=end)
        {
            if(nums[i]<=nums[j])
            {
                merged[k++]=nums[i++];
            }
            else
            {
                merged[k++]=nums[j++];
            }
        }

        while(i<=mid)
        {
            merged[k++]=nums[i++];
        }
        while(j<=end)
        {
            merged[k++]=nums[j++];
        }
        for(i=0,j=start;i<merged.length;i++,j++)
        {
            nums[j]=merged[i];
        }
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        divide(nums,0,n-1);
        return nums;
    }
}
