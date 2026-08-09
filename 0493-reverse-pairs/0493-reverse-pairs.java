class Solution {
    public int mergeSort(int[] nums,int l,int r)
    {
        int count=0;
        if(l>=r) return 0;
        int mid=l+(r-l)/2;
        count+=mergeSort(nums,l,mid);
        count+=mergeSort(nums,mid+1,r);
        
        int i=l;
        int j=mid+1;
        while(i<=mid)
        {
            while(j<=r && (long)nums[i]>2L*nums[j])
            {
                j++;
            }

            count+=j-(mid+1);
            i++;
        }

        merge(nums,l,mid,r);
        return count;
    }

    public void merge(int[] nums,int l,int mid,int r)
    {
        int i=l,j=mid+1,k=0;
        int[] temp=new int[r-l+1];
        while(i<=mid && j<=r)
        {
            if(nums[i]<=nums[j])
            {
                temp[k++]=nums[i++];
            }
            else
            {
                temp[k++]=nums[j++];
            }
        }

        while(i<=mid) temp[k++]=nums[i++];
        while(j<=r) temp[k++]=nums[j++];

        for(int m=0;m<temp.length;m++)
        {
            nums[l+m]=temp[m];
        }
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
        
    }
}