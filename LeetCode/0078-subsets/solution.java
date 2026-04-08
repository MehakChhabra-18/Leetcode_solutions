class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        int total=1<<n;
        for(int i=0;i<total;i++)
        {
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    ans.add(nums[j]);
                }
            }

            res.add(ans);
        }
        return res;
    }
}
