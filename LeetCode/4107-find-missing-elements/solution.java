class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int min=nums[0],max=nums[0];
        for(int i:nums)
        {
            if(i>max)
            {
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
            set.add(i);
        } 
        for(int i=min;i<max+1;i++)
        {
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }

        ArrayList<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);
        return arr;
    }
}
