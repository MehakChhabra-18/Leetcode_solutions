class Solution {
    public int maximumGap(int[] nums) {
        int maxGap=0;
        ArrayList<Integer> list=new ArrayList<>();

        for(int num : nums) {
            list.add(num);
        }

        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++)
        {
            maxGap=Math.max(maxGap,(list.get(i+1)-list.get(i)));
        }

        return maxGap;
    }
}