class Solution {
    public int first(int[] nums,int target)
    {
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }

    public int last(int[] nums,int target)
    {
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=first(nums,target);
        arr[1]=last(nums,target);
        return arr;
        
    }
}
