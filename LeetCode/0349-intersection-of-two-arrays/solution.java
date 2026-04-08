class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                set1.add(i);
            } else {
                continue;
            }
        }
        int[] res = new int[set1.size()];
        int k = 0;
        for(int num:set1)
        {
            res[k++]=num;
        }
        return res;
    }
}
