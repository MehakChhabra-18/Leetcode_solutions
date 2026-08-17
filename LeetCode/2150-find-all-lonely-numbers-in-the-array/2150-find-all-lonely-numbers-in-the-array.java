class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        List<Integer> ans=new ArrayList<>();
        for(int x:map.keySet())
        {
            if(map.get(x)==1 && !map.containsKey(x+1) && !map.containsKey(x-1))
            {
                ans.add(x);
            }
        }

        return ans;
    }
}