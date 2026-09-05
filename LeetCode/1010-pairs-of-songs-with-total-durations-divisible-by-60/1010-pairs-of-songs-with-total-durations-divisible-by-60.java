class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int t : time) {

            int rem = t % 60;
            int required = (60 - rem) % 60;

            if (map.containsKey(required)) {
                ans += map.get(required);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return ans;

    }
}