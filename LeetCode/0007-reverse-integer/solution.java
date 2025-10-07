class Solution {
    public int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int ld = x % 10;
            int newReverse = reverse * 10 + ld;

            // Check overflow: if dividing back doesn’t give original reverse, overflow happened
            if ((newReverse - ld) / 10 != reverse) {
                return 0;
            }

            reverse = newReverse;
            x = x / 10;
        }

        return reverse;
    }
}

