class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       int[] res=new int[2];
       int k=0;
       for(int i=0;i<n;i++)
       {
           int diff=target-nums[i];
           if(map.containsKey(diff))
           {
               res[k++]=map.get(diff);
               res[k]=i;
           }
           map.put(nums[i],i);
       }
       return res;
    }
}
