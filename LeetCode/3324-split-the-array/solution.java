class Solution {
    public boolean isPossibleToSplit(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int x:nums)
         {
             map.put(x,map.getOrDefault(x,0)+1);
         }

         for(int x:map.keySet())
         {
            if(map.get(x)>2)
            {
                return false;
            }
         }
         return true;
    }
}
