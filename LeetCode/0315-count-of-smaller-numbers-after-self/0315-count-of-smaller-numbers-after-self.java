class Solution {
    class Pair
    {
        int val;
        int index;
        Pair(int val,int index)
        {
            this.val=val;
            this.index=index;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++)
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

    public void divide(Pair[] arr,int start,int end,int[] ans)
    {
        if(start>=end) return;
        int mid=start+(end-start)/2;
        divide(arr,start,mid,ans);
        divide(arr,mid+1,end,ans);
        merge(arr,start,mid,end,ans);
    }

    public void merge(Pair[] arr,int start,int mid,int end,int[] ans)
    {
        int i=start,j=mid+1,k=0;
        int rightCount=0;
        Pair[] temp=new Pair[end-start+1];
        while(i<=mid && j<=end)
        {
            if(arr[j].val<arr[i].val)
            {
                rightCount++;
                temp[k++]=arr[j++];
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

        while(j<=end)
        {
            temp[k++]=arr[j++];
        }

        for(int m=0;m<temp.length;m++)
        {
            arr[start+m]=temp[m];
        }
    }
}