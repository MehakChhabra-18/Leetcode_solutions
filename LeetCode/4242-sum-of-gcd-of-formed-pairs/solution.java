class Solution {

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {

        int max = nums[0];
        int[] prefixGcd = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];

            prefixGcd[i] = gcd(nums[i], max);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;

        int left = 0, right = prefixGcd.length - 1;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;
    }
}
