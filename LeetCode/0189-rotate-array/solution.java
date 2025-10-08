class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;              // k bada ho to handle

        reverse(nums, 0, n-1);   // 1) poora array reverse
        reverse(nums, 0, k-1);   // 2) first k elements reverse
        reverse(nums, k, n-1);   // 3) bache hue reverse
    }

    // helper function to reverse part of array
    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

