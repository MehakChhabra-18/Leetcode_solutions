class Solution {
    public long continuousSubarrays(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int left = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > 2) {
                int x = nums[left];
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0) {
                    map.remove(x);
                }
                left++;
            }
            ans += right - left + 1;
        }

        return ans;
    }
}