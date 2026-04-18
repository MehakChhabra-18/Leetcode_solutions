class Solution {
    public int shortestSubarray(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        long[] prefix=new long[n+1];
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]+nums[i];
        }

        for(int i=0;i<=n;i++)
        {
            while(!dq.isEmpty() && prefix[i]-prefix[dq.peekFirst()]>=k)
            {
                minLen=Math.min(minLen,i-dq.pollFirst());
            }

            while(!dq.isEmpty() && prefix[i]<prefix[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return minLen==Integer.MAX_VALUE?-1:minLen;
    }
}
