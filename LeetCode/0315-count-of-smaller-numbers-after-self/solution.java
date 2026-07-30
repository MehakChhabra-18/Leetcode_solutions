class Solution {
    class Pair
    {
        int value;
        int index;
        Pair(int value,int index)
        {
            this.value=value;
            this.index=index;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        Pair[] arr=new Pair[n];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=new Pair(nums[i],i);
        }

        int[] ans=new int[n];
        divide(arr,0,n-1,ans);
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:ans)
        {
           list.add(x);
        }
        return list;
    }

    public void divide(Pair[] arr,int l,int r,int[] ans)
    {
        if(l>=r) return;
        int mid=l+(r-l)/2;
        divide(arr,l,mid,ans);
        divide(arr,mid+1,r,ans);
        merge(arr,l,mid,r,ans);
    }

    public void merge(Pair[] arr,int l,int mid,int r,int[] ans)
    {
        int i=l,j=mid+1,k=0;
        Pair[] temp=new Pair[r-l+1];
        int rightCount=0;
        while(i<=mid && j<=r)
        {
            if(arr[j].value < arr[i].value)
            {
                temp[k++]=arr[j++];
                rightCount++;
            }
            else
            {
                ans[arr[i].index]+=rightCount;
                temp[k++]=arr[i++];
            }
        }

        while(i<=mid)
        {
            ans[arr[i].index]+=rightCount;
            temp[k++]=arr[i++];
        }
        while(j<=r)
        {
            temp[k++]=arr[j++];
        }

        for(int m=0;m<temp.length;m++)
        {
            arr[l+m]=temp[m];
        }
    }
}
