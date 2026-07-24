class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
         int zeroCount=0,oneCount=0,twoCount=0;
         for(int x:nums)
         {
            if(x==0) zeroCount++;
            else if(x==1) oneCount++;
            else if(x==2) twoCount++;
         }

         int i=0;
         while(zeroCount>0)
         {
            nums[i++]=0;
            zeroCount--;
        }

        while(oneCount>0)
        {
            nums[i++]=1;
            oneCount--;
        }
        while(twoCount>0)
        {
            nums[i++]=2;
            twoCount--;
        }
        
    }
}
