class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums)
        {
            list.add(num);
        }
        Collections.sort(list,(e1,e2)->
        {
            return Integer.compare(e1,e2);
        });

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==target)
            {
                ans.add(i);
            }
        }

        return ans;
    }
}