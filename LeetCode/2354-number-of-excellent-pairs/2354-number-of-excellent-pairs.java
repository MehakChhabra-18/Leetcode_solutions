class Solution {
    public long countExcellentPairs(int[] nums, int k) {
        Set<Integer> unique=new HashSet<>();
        for(int num:nums)
        {
            unique.add(num);
        }

        int[] count=new int[unique.size()];
        int index=0;
        for(int num:unique)
        {
            count[index++]=Integer.bitCount(num);
        }

        // long answer=0;
        // for(int i=0;i<count.length;i++)
        // {
        //     for(int j=0;j<count.length;j++)
        //     {
        //         if(count[i]+count[j]>=k)
        //         {
        //             answer++;
        //         }
        //     }
        // }

        // return answer;

        Arrays.sort(count);
        long ans=0;
        for(int i=0;i<count.length;i++)
        {
            int target=k-count[i];
            int start=0,end=count.length;
            while(start<end)
            {
                int mid = start + (end- start) / 2;

                if (count[mid] >= target) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }

            ans += count.length- start;
        }

        return ans;
    }
}