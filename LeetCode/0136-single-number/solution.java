class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i:nums)
    {
        map.put(i,map.getOrDefault(i,0)+1);
    }       

    int val=0;
    for(int i:map.keySet())
    {
        if(map.get(i)==1)
        {
            val=i;
        }
    }
    return val;
}
}
