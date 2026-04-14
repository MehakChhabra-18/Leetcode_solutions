import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
       Deque<Integer> maxD=new LinkedList<>();
       Deque<Integer> minD=new LinkedList<>();
       int n=nums.length;
       int left=0,maxLen=0;
       for(int i=0;i<n;i++)
       {
           while(!maxD.isEmpty() && nums[maxD.peekLast()]<nums[i])
           {
              maxD.pollLast();
           }
           while(!minD.isEmpty() && nums[minD.peekLast()]>nums[i])
           {
               minD.pollLast();
           }
           maxD.addLast(i);
           minD.addLast(i);
           while(nums[maxD.peek()]-nums[minD.peek()]>limit)
           {
                if(maxD.peek()==left) maxD.poll();
                if(minD.peek()==left) minD.poll();
                left++;
           }
           maxLen=Math.max(i-left+1,maxLen);
       }
       return maxLen;
    }
}
