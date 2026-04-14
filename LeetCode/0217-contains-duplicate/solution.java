class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        boolean flag=false;
        for(int num:map.keySet())
        {
            if(map.get(num)>=2)
            {
                flag=true;
            }
        }
        return flag;
        
    }
}
