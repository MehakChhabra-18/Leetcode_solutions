class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for (int i = 0; i < n; i++) {

            // st2 mein jo elements hain,
            // unka SECOND greater current element ho sakta hai
            while (!st2.isEmpty() && nums[st2.peek()] < nums[i]) {
                ans[st2.pop()] = nums[i];
            }

            // st1 mein jo elements current se chhote hain,
            // unka FIRST greater current element hai.
            // Unhe st2 mein bhej do.
            Stack<Integer> temp = new Stack<>();

            while (!st1.isEmpty() && nums[st1.peek()] < nums[i]) {
                temp.push(st1.pop());
            }

            while (!temp.isEmpty()) {
                st2.push(temp.pop());
            }

            // Current element abhi apne FIRST greater
            // ka wait karega
            st1.push(i);
        }

        return ans;
    }
}